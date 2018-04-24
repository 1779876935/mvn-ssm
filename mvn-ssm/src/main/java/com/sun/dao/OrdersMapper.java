package com.sun.dao;

import java.util.List;

import com.sun.entity.OrderCust;
import com.sun.entity.OrderInf;
import com.sun.entity.Orders;

public interface OrdersMapper {
    int insert(Orders record);

    int insertSelective(Orders record);
    
    List<OrderCust> getOrderInf();
    List<OrderInf> getOrderInf2();
}