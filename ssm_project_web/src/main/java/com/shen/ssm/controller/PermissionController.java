package com.shen.ssm.controller;

import com.shen.ssm.domain.Permission;
import com.shen.ssm.domain.Role;
import com.shen.ssm.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Permission> permissions = permissionService.findAll();
        ModelAndView mv=new ModelAndView();
        mv.addObject("permissions",permissions);
        mv.setViewName("permission-list");
        return mv;
    }

    @RequestMapping("/savePermission")
    public String savePermission(Permission permission){
        permissionService.savePermission(permission);
        return "redirect:findAll";
    }
}
