package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.vo.ThisAlcohol;

@Mapper
public interface ThisAlcoholMapper {
	
	public void insertThisAlcoholBoard(ThisAlcohol board);
	public void updateThisAlcoholBoard(ThisAlcohol board);
	public List<ThisAlcohol> getAllBoard();
	public ThisAlcohol searchBoardByNo(int no);
}
