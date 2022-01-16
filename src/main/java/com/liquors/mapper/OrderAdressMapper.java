package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.vo.OrderAdress;

@Mapper
public interface OrderAdressMapper {
	
	public void insertOrderAdress(OrderAdress orderAdress);
	public List<OrderAdress> getAllOrderAdressList();
	public OrderAdress searchOrderAdressByAdressNo(int orderAdressNo);
	public OrderAdress searchOrderAdressByOrderNo(int orderNo);
}
