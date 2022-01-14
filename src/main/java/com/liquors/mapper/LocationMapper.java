package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.Criteria.Criteria;
import com.liquors.vo.Category;
import com.liquors.vo.Location;

@Mapper
public interface LocationMapper {

	public void insertLocation(Location location);
	public List<Location> searchLocation();
	public Location searchByNo(int no);
	public List<Location> searchCategoryAll(Criteria criteria);
}
