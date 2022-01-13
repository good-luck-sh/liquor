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
public class UserTable {

	private int no;
	private String email;
	private String password;
	private String nickName;
	private Date birthDay;
	private String phoneNumber;
	private Date createdDate;
	private Date updateDate;
	private char manager;
	private char resign; //탈퇴여부
}
