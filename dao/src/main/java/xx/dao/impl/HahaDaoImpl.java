/**                                
 * Copyright ® 2013 东软集团股份有限公司
 * 版权所有。     
 */ 

package xx.dao.impl;

import keter.persistence.base.KkAbstractDao;

import org.springframework.stereotype.Repository;

import xx.dao.HahaDao;
import xx.domain.Haha;


@Repository("hahaDao")
public class HahaDaoImpl extends KkAbstractDao<Haha>  implements HahaDao {
	public void ex(){
		System.out.println("我要异常了：");
	    int a[] = new int[1];
	    System.out.println(a[1]);//制造异常
	}
	
	public void exceptionMock() {
		throw new RuntimeException("I'm Exception!");
	}
}