package haha.dao;

import haha.base.AbstractTest;
import junit.framework.Assert;
import keter.domain.User;
import keter.persistence.org.UserDao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends AbstractTest {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(UserDaoTest.class);

	@Autowired
	private UserDao dao;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		User u = new User();
		u.setAccount("gu");
		u.setUsername("顾");
		u.setPassword("pwd");
		//持久化：实体
		u = dao.persistEntity(u);
		
		User u1 = new User();
		u1.setAccount("gu1");
		u1.setUsername("顾1");
		u1.setPassword("pwd");
		//持久化
		dao.persist(u1);
		
		// 查询：全部
		//FIXME:因为引入框架config文件，导致dbinit会被执行一次。因此会有两个用户被写入
		Assert.assertEquals(4, dao.findAll().size());
		// 查询：特定
		Assert.assertEquals("顾", dao.findById(u.getId()).getUsername());
		// 查询：特定
		 Assert.assertEquals("顾", dao.findByAccount("gu").getUsername());

		//修改
		u.setUsername("杨");
		dao.merge(u);
		Assert.assertEquals("杨", dao.findById(u.getId()).getUsername());

		// 删除
		dao.delete(u.getId(),u1.getId());
		Assert.assertEquals(2, dao.findAll().size());
	}
}
