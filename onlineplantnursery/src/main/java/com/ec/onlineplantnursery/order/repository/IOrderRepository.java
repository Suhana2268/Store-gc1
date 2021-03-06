package com.ec.onlineplantnursery.order.repository;

import java.util.List;

import com.ec.onlineplantnursery.order.entity.Order;

public interface IOrderRepository {
	Order updateOrder(Order order);
	Order deleteOrder(int orderId);
	Order viewOrder(int  orderId);
	List<Order> viewAllOrders();
	Order addOrder(Order order, int cid, int pid);

}
