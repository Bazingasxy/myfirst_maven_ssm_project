package com.shen.ssm.controller;

import com.shen.ssm.domain.Permission;
import com.shen.ssm.domain.Role;
import com.shen.ssm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Role> roles = roleService.findAll();
        ModelAndView mv=new ModelAndView();
        mv.addObject("roles",roles);
        mv.setViewName("role-list");
        return mv;
    }

    @RequestMapping("/saveRole")
    public String saveRole(Role role){
        roleService.saveRole(role);
        return "redirect:findAll";
    }

    @RequestMapping("/findPermissionRoleById")
    public ModelAndView findPermissionRoleById(@RequestParam(value = "roleId",required = true)String roleId){
        List<Permission> permissions = roleService.findPermissionRoleById(roleId);
        Role role=roleService.findById(roleId);
        ModelAndView mv=new ModelAndView();
        mv.addObject("permissions",permissions);
        mv.addObject("role",role);
        mv.setViewName("role-permission-add");
        return mv;
    }

    @RequestMapping("/addPermissionToRole")
    public String addPermissionToRole(@RequestParam(value = "roleId", required = true) String roleId, @RequestParam(value = "ids", required = true) String[] ids) {
        roleService.addPermissionToRole(roleId,ids);
        return "redirect:findPermissionRoleById?roleId="+roleId;
    }
}
