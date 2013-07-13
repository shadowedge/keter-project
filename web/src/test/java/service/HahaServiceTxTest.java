//package service;
///**                                
// * Copyright ® 2013 东软集团股份有限公司
// * 版权所有。     
// */
//
//import java.util.Date;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.transaction.TransactionConfiguration;
//
//import xx.dal.AbstractTest;
//import xx.domain.Haha;
//import xx.service.HahaService;
//
//
//@TransactionConfiguration(defaultRollback = false)
//public class HahaServiceTxTest  extends AbstractTest {
//	
//	private static final Logger logger = LoggerFactory.getLogger(HahaServiceTxTest.class);
//
//	@Autowired
//	private HahaService hahaService;
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	/**
//	 * <p>Method ：testTxRollBack
//	 * <p>Description : 事务回滚测试
//	 * @author  gulixing@msn.com
//	 * @version 1.0.0
//	 */
//	@Test
//	public void testTxRollBack(){
//		logger.info("begin haha tx test:");
//		Haha haha = new Haha();
//		haha.setName("shouldn't persist me, Service!");
//		haha.setPeriodEnd(new Date());
//		hahaService.add(haha);
////		hahaService.ex();
//	}
//}
