package com.liquors.mapper;

import java.util.List;

import com.liquors.vo.OrderCartItem;

public interface OrderCartItemMapper {

	public void insertItem(OrderCartItem item);
	public void updateItem(OrderCartItem item);
	public void deleteItem(int no);
	public List<OrderCartItem> getAllCartItemByUser(int userNo);
	public OrderCartItem getAllCartItemByNo(int no);
}
