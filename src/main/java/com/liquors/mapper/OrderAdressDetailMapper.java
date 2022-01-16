package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.vo.OrderAdressDetail;

@Mapper
public interface OrderAdressDetailMapper {
	
	public void insertAdressDetail(OrderAdressDetail adressDetail);
	public List<OrderAdressDetail> getAllOrderAdressDetail();
	public OrderAdressDetail searchOrderAdressDetail(int no);
}
