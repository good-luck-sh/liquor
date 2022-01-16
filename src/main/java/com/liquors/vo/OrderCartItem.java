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
public class OrderCartItem {

	private int no;
	private int userNo;
	private int productNo;
	private int stock;
	private int price;
	private Date createdDate;
	private char orderend; //주문했는지 여부
}
