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
public class OrderAdressDetail {

	private int orderAdressNo;
	private int orderAdressNumber;//우편번호
	private String adressDetail;//자세한 우편주소
}
