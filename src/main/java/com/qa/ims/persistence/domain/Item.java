package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Item {

	private Long Id;
	private String ItemName;
	private Double ItemValue;
	
	
	
	

	public Item(String itemName, Double itemValue) {
		super();
		ItemName = itemName;
		ItemValue = itemValue;
	}

	public Item(Long id, String itemName, Double itemValue) {
		super();
		Id = id;
		ItemName = itemName;
		ItemValue = itemValue;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public Double getItemValue() {
		return ItemValue;
	}

	public void setItemValue(Double itemValue) {
		ItemValue = itemValue;
	}

	
	
	@Override
	public String toString() {
		return "Item:" + "\n Id number is " + Id + "\n The name of the item is: " + ItemName + "\n The value of the item is: " + ItemValue ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, ItemName, ItemValue);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(ItemName, other.ItemName)
				&& Objects.equals(ItemValue, other.ItemValue);
	}
	
	
	
	

}
