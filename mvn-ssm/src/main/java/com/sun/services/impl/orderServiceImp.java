package com.sun.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.dao.OrdersMapper;
import com.sun.entity.OrderCust;
import com.sun.entity.OrderInf;
import com.sun.entity.Orders;
import com.sun.services.orderService;
@Service
@Transactional
public class orderServiceImp implements orderService {
	@Resource
	private OrdersMapper ordersMapper;
	@Override
	public List<OrderCust> getOrders() {
		List<OrderCust> orders = ordersMapper.getOrderInf();
		return orders;
	}
	@Override
	public int insert(Orders orders) {
		int insert = ordersMapper.insert(orders);
		return insert;
	}
	@Override
	public List<OrderInf> getOrders2() {
		List<OrderInf> orders = ordersMapper.getOrderInf2();
		return orders;
	}
	
}
