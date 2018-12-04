package com.shen.ssm.dao;

import com.shen.ssm.domain.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface OrdersDao {

   List<Orders> findAll(@Param("start") int start,@Param("end") int end);

    void saveOrder(Orders orders);

    int findAllCount();

    Orders findDetailsByID(String id);
}
