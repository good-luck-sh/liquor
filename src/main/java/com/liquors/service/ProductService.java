package com.liquors.service;

import java.util.List;

import com.liquors.Criteria.Criteria;
import com.liquors.vo.Product;

public interface ProductService {
	
	/*
	 * public void insertProduct(Product product);
		public List<Product> searchProduct();
		public Product detailByNo(int no);
		public void updateProduct(Product product);
		public List<Product> searchProductAll(Criteria criteria);
}
	 */
	
	/**
	 * 입력받은 상품의 정보를 입력한다.
	 * @param product 입력받은 상품의 정보
	 * @return 입력받은 상품 객체
	 */
	public Product insertProduct(Product product);
	
	/**
	 * 전체적인 상품의 리스트를 출력한다. 
	 * @return 전체적인 상품
	 */
	public List<Product> productAllList();
	
	/**
	 * 입력받은 번호의 상품을 출력한다. 
	 * @param no 입력받은 상품의 정보
	 * @return 상품의 정보
	 */
	public Product productDetailList(int no);
	
	/**
	 * 입력받은 상품의 정보를 수정한다.
	 * @param product 입력받은 상품의 정보
	 * @return 수정된 상품의 정보
	 */
	public Product updateproduct(Product product);

	/**
	 * 검색조건에 해당하는 입력값에 대해 상품의 목록을 출력하는 다이나믹 쿼리이다.
	 * @param criteria 검색조건
	 * @return 상품의 목록
	 */
	public List<Product> productAllListByCriteria(Criteria criteria);
}
