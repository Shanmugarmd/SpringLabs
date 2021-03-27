package com.springlabs.pizzastore.repository;

import com.springlabs.pizzastore.domain.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {

	Optional<Order> findByUserId(Long userId);

	// add to cart
//	boolean addItemsToOrder();
//
//	// place order
//	boolean placeOrder();
//
//	// place shipping addr
//	boolean addModifyShippingAddress();
//
//	// make payment
//	boolean initiatePayment();
//
//	// complete order
//	boolean completeOrder();
//
//	// fetch order status
//	List<Order> fetchActiveOrders();
//
//	// fetch order history
//	List<Order> fetchOrdersHistory();

}