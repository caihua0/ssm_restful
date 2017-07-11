package controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import domain.User;
import service.IUserService;
@Controller
@RequestMapping("/User")
public class UserController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
	private IUserService userService;
	@RequestMapping(value="/All",method=RequestMethod.GET,produces= {"application/json;charset=UTF-8"})
//	@RequestMapping("/All")
	private @ResponseBody List<User> getAll() {	
		List<User> all = this.userService.getAll();
		return all;
	}
}
