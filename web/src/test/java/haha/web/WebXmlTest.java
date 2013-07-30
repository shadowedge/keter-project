package haha.web;

import keter.util.PathUtil;
import keter.web.util.XMLValidator;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * <p>Class       : haha.web.WebXmlTest
 * <p>Descdription: 测试工程的web.xml文件是否符合JavaEE规范
 *				          只有符合规范才有可能顺利在Weblogic下发布
 * @author  gulixing@msn.com
 * @version 1.0.0
 */
public class WebXmlTest {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(WebXmlTest.class);

	@Test
	public void test() {
		logger.info(PathUtil.getProjectRoot()); //file:/E:/git/keter/keter-project/web
		String root = PathUtil.getProjectRoot();
		String webinf = root+"/src/main/webapp/WEB-INF/";
		String xmlFileName = webinf+"web.xml";
	    String xsdFileName = webinf+"/xsd/web-app_2_5.xsd";
	    XMLValidator.validateXMLByXSD(xmlFileName,xsdFileName);
	}
}
