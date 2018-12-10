package cn.tedu.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.ssm.pojo.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/findAll")
	public List<User> findAll(){
		return userService.findAll();
	}
	
	@RequestMapping("/get/{id}")
	public User get(@PathVariable Integer id) {
		return userService.get(id);
	}
	@RequestMapping("/add/{name}/{birthday}/{address}")
	public String add(User user) {
		try {
			userService.add(user);
			return "add ok";
		} catch (Exception e) {
			e.printStackTrace();
			return "add error";
		}
	}
	@RequestMapping("/update/{id}/{name}/{birthday}/{address}")
	public String update(User user) {
		try {
			userService.update(user);
			return "update ok";
		} catch (Exception e) {
			e.printStackTrace();
			return "update error";
		}
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		try {
			userService.delete(id);
			return "delete ok";
		} catch (Exception e) {
			e.printStackTrace();
			return "delete error";
		}
	}
}
