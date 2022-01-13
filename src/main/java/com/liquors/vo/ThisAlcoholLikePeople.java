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
public class ThisAlcoholLikePeople {

	private int no;
	private ThisAlcohol thisAlcohol;
	private UserTable user;
}
