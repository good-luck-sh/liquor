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
public class ProductTasted {

	private int productNo;
	private int sweet;// 달콤한정도 1~5 5가제일 높음
	private int sour;//시큼함
	private int refreshment;//청량감
	private int heavin;//무거움정도
}
