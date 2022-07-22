package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.dao.OrderItemDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.OrderItem;
import com.qa.ims.utils.Utils;

/**
 * Takes in customer details for CRUD functionality
 *
 */
public class OrderItemController implements CrudController<OrderItem> {

	public static final Logger LOGGER = LogManager.getLogger();

	

	private OrderItemDAO orderItemDAO;
	private Utils utils;

	public OrderItemController(OrderItemDAO orderItemDAO, Utils utils) {
		super();
		this.orderItemDAO = orderItemDAO;
		this.utils = utils;
	}

	/**
	 * Reads all customers to the logger
	 */
	@Override
	public List<OrderItem> readAll() {
		List<OrderItem> orderItem = orderItemDAO.readAll();
		for (OrderItem orderItems : orderItem) {
			LOGGER.info(orderItems);
		}
		return orderItem;
	}

	/**
	 * Creates a customer by taking in user input
	 */
	@Override
	public OrderItem create() {
		LOGGER.info("Please enter a order item id");
		Long orderItemId = utils.getLong();
		LOGGER.info("Please enter a order id");
		Long orderId = utils.getLong();
		LOGGER.info("Please enter a item id");
		Long itemId = utils.getLong();
		LOGGER.info("Please enter  item value");
		Double itemValue = utils.getDouble();
		OrderItem orderItem = orderItemDAO.create(new OrderItem(orderItemId, orderId, itemId, itemValue));
		LOGGER.info("Order item created");
		return orderItem;
	}

	/**
	 * Updates an existing customer by taking in user input
	 */
	@Override
	public OrderItem update() {
		LOGGER.info("Please enter the id of the order-item you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter a order id");
		Long orderId = utils.getLong();
		LOGGER.info("Please enter item id");
		Long itemId = utils.getLong();
		LOGGER.info("Please enter item value");
		Double itemValue = utils.getDouble();
		OrderItem orderItem = orderItemDAO.update(new OrderItem(id, orderId, itemId, itemValue));
		LOGGER.info("OrderItem Updated");
		return orderItem;
	}

	/**
	 * Deletes an existing customer by the id of the customer
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order item you would like to delete");
		Long id = utils.getLong();
		return orderItemDAO.delete(id);
	}

}
