package haha.web;

import java.sql.SQLException;

import keter.web.util.JndiDataSourceValidator;

import org.junit.Test;

public class DataSourceLookUpTest {

	@Test
	public void test() throws SQLException {
		JndiDataSourceValidator.validateWLS(
				"t3://192.168.0.11:7001",
				"keter-DataSource");
	}
}