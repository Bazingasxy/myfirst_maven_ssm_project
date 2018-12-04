package com.shen.ssm.service.impl;

import com.shen.ssm.dao.OrdersDao;
import com.shen.ssm.domain.Orders;
import com.shen.ssm.domain.Page;
import com.shen.ssm.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersDao ordersDao;

    @Override
    public Page findAll(int currentPage, int pageSize) {
        Page page=new Page();
        int totalCount = ordersDao.findAllCount(); //求出总条目数
        page.setTotalCount(totalCount);//设置总条目数
        page.setPageSize(pageSize);//设置每页显示的条目数

        int totoPage=totalCount%pageSize==0?totalCount/pageSize:(totalCount/pageSize)+1;//求出总页数
        page.setTotalPage(totoPage);//设置总页数
        page.setCurrentPage(currentPage);//设置当前页

        int start;
        if(currentPage==1){
            start=currentPage;
        }else {
            start=1+(pageSize*(currentPage-1));
        }//开启索引
        int end=currentPage*pageSize; //结束索引
        List<Orders> all = ordersDao.findAll(start,end);
        page.setList(all);
        return page;
    }


    @Override
    public Orders findDetailsByID(String id) {
        return ordersDao.findDetailsByID(id);
    }
}
