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
public class OrderTable {

	private int no;
	private int userNo;
	private Date createdDate;
	private String payment; //결제완료
	private String delivery; //배송중
	private String completed; //배송완료
	private Date compleatedDate; //배송완료일
}
