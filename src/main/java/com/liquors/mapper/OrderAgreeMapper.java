package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.vo.OrderAgree;

@Mapper
public interface OrderAgreeMapper {
	
	public void insertOrderAgree(OrderAgree orderAgree);
	public List<OrderAgree> getAllOrderAgree();
	public OrderAgree searchOrderAgree(int no);
	public void updateOrderAgree(char yes);
	
}
