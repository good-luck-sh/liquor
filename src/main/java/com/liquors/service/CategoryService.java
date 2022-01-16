package com.liquors.service;

import java.util.List;

import com.liquors.Criteria.Criteria;
import com.liquors.vo.Category;

public interface CategoryService {
	
	/*
	 * public void insertCategory(Category category);
		public List<Category> searchCategory();
		public Category searchByNo(int no);
		
	 */
	/**
	 * 저장할 카테고리를 입력하면 저장되고 해당카테고리가 반환된다.
	 * @param category 저장할 카테고리 
	 * @return 저장한 카테고리
	 */
	public Category insertCategory(Category category);
	
	/**
	 * 카테고리 리스트를 전체 반환한다.
	 * @return 카테고리 리스트
	 */
	public List<Category> searchCategory();
	
	/**
	 * 카테고리 번호를 입력하면 해당 카테고리가 출력된다. 
	 * @param no 찾을 카테고리 번호
	 * @return 카테고리 객체
	 */
	public Category searchByNo(int no);
	
}
