package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderAgreementMapper {

	public void insertOrderAgreement(OrderAgreementMapper orderAgreement);
	public List<OrderAgreementMapper> getAllOrderAgreement();
	public OrderAgreementMapper searchOrderAgreement(int no);
}
