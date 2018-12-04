package com.shen.ssm.controller;

import com.shen.ssm.domain.Orders;
import com.shen.ssm.domain.Page;
import com.shen.ssm.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(value = "currentPage",required = true,defaultValue = "1") String currentPage,@RequestParam(value = "pageSize",required = true,defaultValue = "4") String pageSize){
        int currentPages = Integer.parseInt(currentPage);
        int pageSizes = Integer.parseInt(pageSize);
        Page page = ordersService.findAll(currentPages,pageSizes);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("page",page);
        modelAndView.setViewName("orders-list");
        return modelAndView;
    }

    @RequestMapping("/showDetails")
    public ModelAndView showDetails(@RequestParam(value = "id",required = true)String id){
        ModelAndView mv=new ModelAndView();
        Orders orders = ordersService.findDetailsByID(id);
        mv.addObject("orders",orders);
        mv.setViewName("orders-details");
        return mv;
    }
}
