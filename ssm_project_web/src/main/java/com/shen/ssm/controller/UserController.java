package com.shen.ssm.controller;


import com.shen.ssm.domain.Role;
import com.shen.ssm.domain.UserInfo;
import com.shen.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public ModelAndView findAll() {
        List<UserInfo> usersList = userService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("list", usersList);
        mv.setViewName("user-list");
        return mv;
    }

    @RequestMapping("saveUser")
    public String saveUser(UserInfo userInfo) {
        System.out.println(userInfo);
        userService.saveUser(userInfo);
        return "redirect:findAll";
    }

    @RequestMapping("/show")
    public ModelAndView showUserById(@RequestParam(value = "id", required = true) String id) {
        UserInfo userInfo = userService.showUserById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("userInfo", userInfo);
        mv.setViewName("user-show");
        return mv;
    }

    @RequestMapping("/delete")
    public String deleteUser(@RequestParam(value = "id", required = true) String id) {
        userService.deleteUser(id);
        return "redirect:findAll";
    }

    @RequestMapping("/findUserByIdAndAllRole")
    public ModelAndView findUserByIdAndAllRole(@RequestParam(value = "userId", required = true) String userId) {
        List<Role> roles = userService.findUserRoleById(userId);
        UserInfo user = userService.findById(userId);
        ModelAndView mv = new ModelAndView();
        mv.addObject("roles", roles);
        mv.addObject("user", user);
        mv.setViewName("user-role-add");
        return mv;
    }

    @RequestMapping("/addRoleToUser")
    public String addRoleToUser(@RequestParam(value = "userId", required = true) String userId, @RequestParam(value = "ids", required = true) String[] ids) {
        userService.addRoleToUser(userId, ids);
        return "redirect:findUserByIdAndAllRole?userId="+userId;
    }
}
