package com.liquors.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductReviewReply {

	private ProductReview review;
	private int no;
	private UserTable user;
	private String content;
	private Date createdDate;
	private char deleted;
}
