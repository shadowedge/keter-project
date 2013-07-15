package haha.dao.impl;

import haha.dao.HahaDao;
import haha.domain.Haha;
import keter.dao.base.KeterAbstractDao;

import org.springframework.stereotype.Repository;

@Repository
public class HahaDaoImpl extends KeterAbstractDao<Haha> implements HahaDao {

	public void ex() {
		System.out.println("我要异常了：");
		int a[] = new int[1];
		System.out.println(a[1]);// 制造异常
	}

	public void exceptionMock() {
		throw new RuntimeException("I'm Exception!");
	}
}