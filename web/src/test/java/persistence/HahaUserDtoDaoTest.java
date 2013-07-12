//package persistence;
///**                                
// * Copyright ® 2013 东软集团股份有限公司
// * 版权所有。     
// */
//import kk.org.User;
//import kk.persistence.org.UserDao;
//
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import xx.dal.AbstractTest;
//import xx.domain.Haha;
//import xx.persistence.HahaDao;
//import xx.persistence.HahaUserDtoDao;
//
//
//
///**
// * <p>
// * Class : test.persistence.HahaDaoTest
// * <p>
// * Descdription: 类功能描述
// * 
// * @author 顾力行-gulixing@msn.com
// * @version 1.0.0
// */
//public class HahaUserDtoDaoTest extends AbstractTest {
//	
//
//	@Autowired
//	private HahaDao hDao;
//	
//	@Autowired
//	private UserDao uDao;
//
//	@Autowired
//	private HahaUserDtoDao huDao;
//
//	@Before
//	public void setUp() throws Exception {
//		//构造1条haha记录
//		Haha haha = new Haha();
//		haha.setName("haha1");
//		haha.setUserId(1L);
//		hDao.persist(haha);
//		
//		//构造2条user记录
//		User user = new User();
//		user.setAccount("user");
//		user.setPassword("password");
//		user.setUsername("用户名");
//		uDao.persist(user);
//		
//		User user1 = new User();
//		user1.setAccount("user1");
//		user1.setPassword("password");
//		user1.setUsername("用户名1");
//		uDao.persist(user1);
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//	
//	@Test
//	public void test(){
//		Assert.assertEquals("用户名", huDao.findByUserId(1L).get(0).getUserName());
//	}
//
//}
