package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.vo.OrderDetail;

@Mapper
public interface OrderDetailMapper {
	
	public void insertOrderDetail(OrderDetail orderDetail);
	public List<OrderDetail> getAllOrderDetail();
	public OrderDetail searchOrderDetail(int no);
}
