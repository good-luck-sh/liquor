package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.vo.ProductTasted;

@Mapper
public interface ProductTastedMapper {
	
	public void insertProductTaste(ProductTasted taste);
	public ProductTasted getAllByProductNo(int productNo);
}
