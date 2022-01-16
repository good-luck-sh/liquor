package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.vo.ThisAlcohol;
import com.liquors.vo.ThisAlcoholLikePeople;

@Mapper
public interface ThisAlcoholLikePeopleMapper {
	
	public void insertLikePeople(ThisAlcoholLikePeople people);
	public List<ThisAlcoholLikePeople> getAllLikePeopleByBoardNo(int thisalcoholNo);
	public List<ThisAlcohol> getAllThisAlcohol(int userNo);
	public ThisAlcohol getAllThisAlcoholByNo(int userNo, int thisalcoholNo);
	
}
