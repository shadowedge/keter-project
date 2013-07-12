//package service;
///**                                
// * Copyright ® 2013 东软集团股份有限公司
// * 版权所有。     
// */
//
//import junit.framework.Assert;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import xx.dal.AbstractTest;
//import xx.domain.Haha;
//import xx.service.HahaService;
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
//public class HahaServiceTest extends AbstractTest {
//
//	@Autowired
//	private HahaService service;
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//	
//	@Test
//	public void test(){
//		Haha haha = new Haha();
//		haha.setName("hahaha");
//		//保存
//		service.add(haha);
//		//查询：全部
//		Assert.assertEquals("hahaha", service.all().get(0).getName());
//	}
//	
//}
