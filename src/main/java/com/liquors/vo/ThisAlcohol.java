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
public class ThisAlcohol {

	private int no;
	private int userNo;
	private String title;
	private String content;
	private int likeCount;
	private Date createdDate;
	private Date updatedDate;
	
}
