package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.vo.OrderTable;

@Mapper
public interface OrderTableMapper {

	public void insertOrder(OrderTable orderTable);
	public List<OrderTable> getAllOrder();
	public OrderTable searchOrderByNo(int no);
	public void updateOrder(OrderTable orderTable);
}
