package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {

	private Long id;
	private Long customerId;
	private Long OrderQuantity;

	

	public Order(Long customerId, Long orderQuantity) {
		super();
		this.customerId = customerId;
		OrderQuantity = orderQuantity;
	}
	
	

	public Order(Long id, Long customerId, Long orderQuantity) {
		super();
		this.id = id;
		this.customerId = customerId;
		OrderQuantity = orderQuantity;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getOrderQuantity() {
		return OrderQuantity;
	}

	public void setOrderQuantity(Long orderQuantity) {
		OrderQuantity = orderQuantity;
	}

	@Override
	public String toString() {
		return "id:" + id + " customer id:" + customerId + " amount of items in order:" + OrderQuantity;
	}



	@Override
	public int hashCode() {
		return Objects.hash(OrderQuantity, customerId, id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return OrderQuantity == other.OrderQuantity && Objects.equals(customerId, other.customerId)
				&& Objects.equals(id, other.id);
	}

	
}
