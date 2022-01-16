package com.liquors.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liquors.Criteria.Criteria;
import com.liquors.vo.Category;

@Mapper
public interface CategoryMapper {

	public void insertCategory(Category category);
	public List<Category> searchCategory();
	public Category searchByNo(int no);
}
