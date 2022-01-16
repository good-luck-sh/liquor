package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.vo.ManagerBoard;

@Mapper
public interface ManagerBoardMapper {
	
	public void insertManagerBoard(ManagerBoard board);
	public List<ManagerBoard> getAllBoard();
	public ManagerBoard searchManagerBoard(int no);
}
