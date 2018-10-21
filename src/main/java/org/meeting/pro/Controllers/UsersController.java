package org.meeting.pro.Controllers;

import org.meeting.pro.Entity.Users;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	@ResponseBody
	@RequestMapping("/dummyuser")
	public ResponseEntity<Users> getUser(@RequestParam("id") String id){
		
		System.out.println("id => "+id);
		Users u = new Users();
		u.setEmail("ddd.@gmail.com");
		u.setFirstName("fff");
		u.setLastName("ffdf");
	//	u.setUid("2313");
		ResponseEntity<Users> ru = new ResponseEntity<Users>(u, HttpStatus.OK);
		return ru;
	}
}
