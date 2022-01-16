package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.vo.ProductReviewReply;

@Mapper
public interface ProductReviewReplyMapper {
	
	public void insertProductReviewReply(ProductReviewReply reply);
	public void updateProductReviewReply(ProductReviewReply reply);
	public List<ProductReviewReply> getReplyListByReviewNo(int reviewNo);
	public List<ProductReviewReply> getReplyListByUserNo(int userNo);
}
