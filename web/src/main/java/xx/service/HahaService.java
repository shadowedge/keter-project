package xx.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xx.dao.HahaDao;
import xx.domain.Haha;


@Service("hahaService")
public class HahaService {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(HahaService.class);

	/**
	 * Logger for this class
	 */
	

	@Autowired
	private HahaDao hahaDao;
	
	public List<Haha> all(){
		logger.info("find all haha");
		return hahaDao.findAll();
	}
	
	public Haha findById(long id){
		logger.info("find haha id:{}",id);
		return hahaDao.findById(id);
	}
	
	public Haha add(Haha haha){
		return hahaDao.persistEntity(haha);
	}
	
	/**
	 * <p>Method ：ex
	 * <p>Description : 模拟异常
	 * @author  gulixing@msn.com
	 * @version 1.0.0
	 */
	public void ex(){
		hahaDao.ex();
	}
	
	public void setHahaDao(HahaDao hahaDao) {
		this.hahaDao = hahaDao;
	}
	
	public HahaDao getHahaDao() {
		return  hahaDao;
	}
}
