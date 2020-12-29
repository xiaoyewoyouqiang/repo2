package easymall.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("indexController")
public class IndexController {
	
	@RequestMapping("/index/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/index/logout")
	public String logout(HttpSession session) {
		return "redirect:/index.jsp";//跳转到主页
	}
	
	@RequestMapping("/index/regist")
	public String register() {
		return "regist";
	}
}
