package cn.an.spring;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/reg.do")
	public String showReg(){
		return "reg";
	}
	@RequestMapping("/login.do")
	public String showLogin(){
		return "login";
	}
	@RequestMapping("/index.do")
	public String showList(){
		return "index";
	}
	@RequestMapping("/error.do")
	public String showError(){
		return "error";
	}
	
	@RequestMapping(value="/hReg.do", method=RequestMethod.POST)
	public String handleReg(User user){
		System.out.println("UserController.handleReg()--"+user);
		return "redirect:login.do";
	}
	
	@RequestMapping(value="/hLogin.do", method=RequestMethod.POST)
	public String handleLogin(User user,String checkcode,ModelMap modlemap){
		System.out.println("UserController.handleLogin()--"+user);
		if ("admin".equals(user.getName())) {
			modlemap.addAttribute("result", "登陆成功");
			return "index";
		}else {
			modlemap.addAttribute("result", "用户名错误");
			return "error";
		}
	}
	
	
	
	/*
     * 解决createTime格式转换问题Date to String
     */
    @InitBinder  
    public void initBinder(WebDataBinder binder) {  
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        dateFormat.setLenient(false);  
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
