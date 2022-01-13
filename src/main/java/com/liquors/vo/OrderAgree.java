package com.liquors.vo;

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
	private OrderTable order;
	private UserTable user;
	private OrderAgreement agreement;
}
