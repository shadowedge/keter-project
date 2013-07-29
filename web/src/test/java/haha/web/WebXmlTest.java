package haha.web;

import keter.util.PathUtil;
import keter.web.util.XMLValidator;

import org.apache.log4j.Logger;
import org.junit.Test;

public class WebXmlTest {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(WebXmlTest.class);

	@Test
	public void test() {
		logger.info(PathUtil.getProjectRoot()); //file:/E:/git/keter/keter-project/web
		String root = PathUtil.getProjectRoot();
		String xmlFileName = root+"/src/main/webapp/WEB-INF/web.xml";
	    String xsdFileName = root+"/src/main/webapp/WEB-INF/xsd/web-app_2_5.xsd";
	    XMLValidator.validateXMLByXSD(xmlFileName,xsdFileName);
	}
}
