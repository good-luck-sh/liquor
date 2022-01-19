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
public class ProductReview {

	private int no;
	private int productNo;
	private String title;
	private String content;
	private String picture;
	private int like;
	private Date createdDate;
	private Date updatedDate;
	private char deleted;
	
}
