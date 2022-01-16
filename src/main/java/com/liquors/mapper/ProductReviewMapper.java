package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.vo.ProductReview;

@Mapper
public interface ProductReviewMapper {
	
	public void insertProductReview(ProductReview review);
	public void updateProductReview(ProductReview review);
	public List<ProductReview> getAllProductReview();
	public List<ProductReview> searchProductReviewByProductNo(int productNo);
	public ProductReview searchProductReviewByReviewNo(int reviewNo);
}
