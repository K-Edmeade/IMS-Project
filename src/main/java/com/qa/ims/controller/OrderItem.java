package com.qa.ims.persistence.domain;

import java.util.Objects;

public class OrderItem {

	private Long id;
	private Long OrderId;
	private Long ItemId;
	private Double ItemValue;

	public OrderItem(Long orderId, Long itemId, Double itemValue) {
		super();
		OrderId = orderId;
		ItemId = itemId;
		ItemValue = itemValue;
	}

	public OrderItem(Long id, Long orderId, Long itemId, Double itemValue) {
		super();
		this.id = id;
		OrderId = orderId;
		ItemId = itemId;
		ItemValue = itemValue;
	}

	@Override
	public String toString() {
		return "Order Item:\n id: " + id + "\n OrderId" + OrderId + "\n ItemId: " + ItemId + "\n Item Value: "
				+ ItemValue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return OrderId;
	}

	public void setOrderId(Long orderId) {
		OrderId = orderId;
	}

	public Long getItemId() {
		return ItemId;
	}

	public void setItemId(Long itemId) {
		ItemId = itemId;
	}

	public Double getItemValue() {
		return ItemValue;
	}

	public void setItemValue(Double itemValue) {
		ItemValue = itemValue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ItemId, ItemValue, OrderId, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(ItemId, other.ItemId) && Objects.equals(ItemValue, other.ItemValue)
				&& Objects.equals(OrderId, other.OrderId) && Objects.equals(id, other.id);
	}

}
