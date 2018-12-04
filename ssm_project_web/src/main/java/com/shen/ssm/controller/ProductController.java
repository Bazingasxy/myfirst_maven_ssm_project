package com.shen.ssm.controller;


import com.github.pagehelper.PageInfo;
import com.shen.ssm.domain.Product;
import com.shen.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(value = "currentPage",required = true,defaultValue = "1") int currentPage, @RequestParam(value = "pageSize",required = true,defaultValue = "5") int pageSize){
        List<Product> productList = productService.findAll(currentPage,pageSize);
        ModelAndView modelAndView=new ModelAndView();
        PageInfo pageInfo=new PageInfo(productList);
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.setViewName("product-list");
        return modelAndView;
    }

    @RequestMapping("/saveProduct")
    public String saveProduct(Product product) throws Exception {
        productService.saveProduct(product);
        return "redirect:findAll";
    }
}
