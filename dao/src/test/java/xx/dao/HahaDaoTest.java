package xx.dao;

import haha.dao.HahaDao;
import haha.domain.Haha;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import xx.base.AbstractTest;

public class HahaDaoTest extends AbstractTest {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(HahaDaoTest.class);

	@Autowired
	private HahaDao dao;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test(){
		Haha haha1 = new Haha();
		haha1.setName("haha1");
		haha1.setUserId(1L);
		
		logger.info("haha's name is:{}",haha1.getName());
		
		Haha haha2 = new Haha();
		haha2.setName("haha2");
		haha2.setUserId(1L);

		//保存
		dao.persist(haha1);
		haha2 = dao.persistEntity(haha2);
		logger.info("find all");
		//查询：全部
		Assert.assertEquals(2, dao.findAll().size());
		
		//查询：特定
		Assert.assertEquals(haha2.getId().longValue(), dao.findById(haha2.getId()).getId().longValue());
		
		//修改
		haha2.setName("haha2 updated");
		dao.merge(haha2);
		Assert.assertEquals("haha2 updated", dao.findById(haha2.getId()).getName());
	}
}
