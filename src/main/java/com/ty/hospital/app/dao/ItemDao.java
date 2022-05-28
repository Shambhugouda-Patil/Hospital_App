package com.ty.hospital.app.dao;

import java.util.List;

import com.ty.hospital.app.dto.Item;

public interface ItemDao {
	
	public Item saveItem(Item item, int medOrder_id);
	public Item getItemById(int id);
	public List<Item> getItemByMedOrder(int medOrder_id);
	public Item updateItem(Item item, int id);
	public boolean deleteItem(int id);

}
