package com.liquors.dao;

import java.util.Date;

import com.liquors.vo.Category;
import com.liquors.vo.Location;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductCriteria {

	private int categoryNo;
	private String categoryTitle;
	private int locationNo;
	private String locationName;
	private int productNo;
	private int stock;
	private String name;
	private String content;
	private String picture;
	private String maker;
	private Date createdDate;
	private char soldOut;//품절여부
	
}
