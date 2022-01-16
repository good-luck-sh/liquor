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
public class OrderAgree { //주문동의

	private int no;
	private int orderNo;
	private int userNo;
	private int agreementNo;
	private Date orderAgreeCreatedDate;
	private char orderAgreeCheck;
}
