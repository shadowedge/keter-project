package haha.web;

import java.sql.SQLException;

import keter.web.util.JndiDataSourceValidator;

import org.junit.Test;

/**
 * <p>Class       : haha.web.JndiDataSourceTest
 * <p>Descdription: 测试Weblogic数据源可否连接成功
 *
 * @author  gulixing@msn.com
 * @version 1.0.0
 */
public class JndiDataSourceTest {

	@Test
	public void test() throws SQLException {
		JndiDataSourceValidator.validateWLS(
				"t3://192.168.0.11:7001",
				"keter-DataSource");
	}
}