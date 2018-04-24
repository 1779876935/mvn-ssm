package com.sun.services;

import java.util.List;

import com.sun.entity.OrderCust;
import com.sun.entity.OrderInf;
import com.sun.entity.Orders;

public interface orderService {
	int insert(Orders orders);
	public List<OrderCust> getOrders();
	public List<OrderInf> getOrders2();
}
