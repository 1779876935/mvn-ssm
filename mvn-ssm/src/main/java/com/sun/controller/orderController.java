package com.sun.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.entity.OrderInf;
import com.sun.entity.Orders;
import com.sun.services.orderService;
import com.sun.utils.UtilsOfStr;

@Controller
@RequestMapping(value = "/order")
public class orderController {
	@Resource
	private orderService orderService;

	@RequestMapping(value = "/orders")
	@ResponseBody
	public List<OrderInf> getAllOrders(HttpServletRequest request, Model model) {
		List<OrderInf> orders = orderService.getOrders2();
		String orderJson = UtilsOfStr.getJsonStr4obj(orders);
		return orders;
	}
	
	@RequestMapping(value = "/addOrders")
	@ResponseBody
	public String addOrder(HttpServletRequest request,Model model){
		Orders orders = new Orders();
		orders.setUserId("2");
		orders.setOrderAddress("北京");
		int i = orderService.insert(orders);
		return i+"";
	}
}
