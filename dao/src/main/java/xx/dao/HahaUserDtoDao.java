package xx.dao;

import java.util.Date;
import java.util.List;

import keter.persistence.base.KkDao;
import xx.domain.HahaUserDto;



public interface HahaUserDtoDao extends KkDao<HahaUserDto>{
	public List<HahaUserDto> findByUserId(Long userId);
	public List<HahaUserDto> aggregateByPeriod(Long userId,Date periodStart, Date periodEnd);
}
