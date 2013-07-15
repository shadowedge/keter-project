/**                                
 * Copyright ® 2013 东软集团股份有限公司
 * 版权所有。     
 */ 

package haha.dao.impl;

import haha.dao.HahaDao;
import haha.domain.Haha;
import keter.dao.base.KeterAbstractDao;
import keter.domain.User;

import org.springframework.stereotype.Repository;


@Repository("hahaDao")
public class HahaDaoImpl extends KeterAbstractDao<Haha>  implements HahaDao {
	
	//TODO:可否省略此处构造方法？
	protected HahaDaoImpl() {
		super(Haha.class);
	}
	
	public void ex(){
		System.out.println("我要异常了：");
	    int a[] = new int[1];
	    System.out.println(a[1]);//制造异常
	}
	
	public void exceptionMock() {
		throw new RuntimeException("I'm Exception!");
	}
}