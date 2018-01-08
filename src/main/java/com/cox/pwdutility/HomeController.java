package com.cox.pwdutility;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cox.pwdutility.model.User;
import com.cox.pwdutility.services.impl.IUserPWDUpdate;


@RestController
public class HomeController {

	
	@Autowired
	IUserPWDUpdate iuserupdate;
	
	@RequestMapping("/")
	public String index() {
		return "Welcome to DB test";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getData/{userseqid}")
	public List<User> getData(@PathVariable("userseqid") Long userseqid) {
		return iuserupdate.updateAllPWD(userseqid);
	}
}
