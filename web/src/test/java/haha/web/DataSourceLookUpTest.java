package haha.web;

import java.sql.SQLException;

import keter.web.util.DataSourceValidator;

import org.junit.Test;

public class DataSourceLookUpTest {

	@Test
	public void test() throws SQLException {
		DataSourceValidator.validateWLS(
				"t3://192.168.0.11:7001",
				"keter-DataSource");
	}
}