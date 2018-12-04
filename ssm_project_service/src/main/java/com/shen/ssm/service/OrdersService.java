package com.shen.ssm.service;

import com.shen.ssm.domain.Orders;
import com.shen.ssm.domain.Page;

public interface OrdersService {
    /**
     * 查询所有
     * @param currentPage
     * @param pageSize
     */
   Page findAll(int currentPage, int pageSize);


    /**
     * 根据id查询详情
     * @return
     * @param id
     */
    Orders findDetailsByID(String id);
}
