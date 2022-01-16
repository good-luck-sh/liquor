package com.liquors.service;

import java.util.List;

import com.liquors.Criteria.Criteria;
import com.liquors.vo.Location;

public interface LocationService {
	/*
	 * public void insertLocation(Location location);
		public List<Location> searchLocation();
		public Location searchByNo(int no);
	 */
	/**
	 * 지역에 대한 정보를 입력하고 입력이 완료되면 지역 객체를 출력한다.
	 * @param location 입력원하는 지역정보객체
	 * @return 입력완료한 해당 지역정보객체
	 */
	public Location insertLocation(Location location);
	
	/**
	 * 지역에 대한 리스트를 전체 출력하는 객체
	 * @return 지역에 대한 리스트
	 */
	public List<Location> searchLocation();
	
	/**
	 * 찾길 원하는 지역번호를 입력하면 해당 지역에 대한 객체가 출력된다.
	 * @param no 지역번호
	 * @return 해당하는 지역 객체
	 */
	public Location searchByNo(int no);
}
