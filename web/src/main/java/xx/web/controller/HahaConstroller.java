package xx.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import keter.domain.User;
import keter.web.controller.BaseController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import xx.dao.HahaDao;
import xx.domain.Haha;
import xx.service.HahaService;

@Controller
@RequestMapping("/haha")
// 模块全部以/haha开头
public class HahaConstroller extends BaseController {
	@Autowired
	HahaDao hahaDao;

	@Autowired
	HahaService hahaService;

	private static final Logger logger = LoggerFactory
			.getLogger(HahaConstroller.class);

	public HahaConstroller() {
	}

	/**
	 * <p>
	 * Method ：index
	 * <p>
	 * Description : 处理 /haha请求，自动跳转到/haha/index.jsp
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 * @throws Exception
	 * @author gulixing@msn.com
	 * @version 1.0.0
	 */
	@RequestMapping(value = Routes.Index, method = RequestMethod.GET)
	public String index(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {
		logger.info("intro haha index:");
//		model.addAttribute("haha", hahaService.all());
		model.addAttribute("haha", hahaDao.findAll());

		User currentUser = getCurrentUser();
		model.addAttribute("userName", currentUser.getUsername());
		// ArrayUtils.wrap(objects)
		return "/haha/index";
	}

	// @PreAuthorize("hasRole('ROLE_USER')")
	@RequestMapping(value = "/private/", method = RequestMethod.GET)
	public String privateHaha(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {
		model.addAttribute("haha", hahaService.all());
		User currentUser = getCurrentUser();
		model.addAttribute("userName", currentUser.getUsername());
		// ArrayUtils.wrap(objects)
		return "/haha/index";
	}
	
	@RequestMapping(value = "/tx", method = RequestMethod.GET)
	public String tx(HttpServletRequest request, HttpServletResponse response,
			ModelMap model) throws Exception {
		logger.info("====== begin haha txRollback======");
		Haha haha = new Haha();
		haha.setName("Don't persist me:Controller!");
		haha.setPeriodEnd(new Date());
		try {
			hahaDao.persist(haha);
			hahaService.ex();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		model.addAttribute("haha", hahaService.all());
		return "/haha/index";
	}

	/**
	 * <p>
	 * Method ：add
	 * <p>
	 * Description : 处理 /haha/add
	 * 
	 * @param request
	 * @param response
	 * @param modelMap
	 * @return
	 * @throws Exception
	 * @author gulixing@msn.com
	 * @version 1.0.0
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap) throws Exception {
		logger.info("add haha");
		create();
		return redirectToUrl("/haha/index");
	}

	private void create() {
		Haha haha = new Haha();
		haha.setName("I'm Haha!");
		hahaService.add(haha);
		System.out.println("add haha");
		// return returnString;
	}

	@RequestMapping(value = "/haha/{user}", method = RequestMethod.GET)
	public ModelAndView myMethod(HttpServletRequest request,
			HttpServletResponse response, @PathVariable("user") String user,
			ModelMap modelMap) throws Exception {
		modelMap.put("loginUser", user);
		return new ModelAndView("/haha/index", modelMap);
	}

	/**
	 * <p>
	 * Method ：index
	 * <p>
	 * Description : 处理 /haha请求，自动跳转到/haha/index.jsp
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 * @throws Exception
	 * @author yangmingoscar2002@gmail.com
	 * @version 1.0.0
	 */
	@RequestMapping(value = "/layout", method = RequestMethod.GET)
	public String layout(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {
		// ArrayUtils.wrap(objects)
		return "/haha/mainlayout";
	}
}