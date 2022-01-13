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
public class Product {
	private int no;
	private Location location;
	private Category category;
	private int stock;
	private String name;
	private String content;
	private String picture;
	private String maker;
	private Date createdDate;
	private char soldOut;//품절여부
}
