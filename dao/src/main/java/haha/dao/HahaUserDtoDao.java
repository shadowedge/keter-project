package haha.dao;

import haha.domain.HahaUserDto;

import java.util.Date;
import java.util.List;

import keter.persistence.base.KeterDao;



public interface HahaUserDtoDao extends KeterDao<HahaUserDto>{
	public List<HahaUserDto> findByUserId(Long userId);
	public List<HahaUserDto> aggregateByPeriod(Long userId,Date periodStart, Date periodEnd);
}
