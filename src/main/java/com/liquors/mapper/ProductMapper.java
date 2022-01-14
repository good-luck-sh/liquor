package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.Criteria.Criteria;
import com.liquors.vo.Product;

@Mapper
public interface ProductMapper {
	
	public void insertProduct(Product product);
	public List<Product> searchProduct();
	public Product detailByNo(int no);
	public void updateProduct(Product product);
	public List<Product> searchProductAll(Criteria criteria);
}
