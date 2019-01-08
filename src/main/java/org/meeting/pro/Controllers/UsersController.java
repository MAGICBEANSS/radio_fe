package org.meeting.pro.Controllers;

import org.meeting.pro.Entity.Users;
import org.meeting.pro.Services.UserService;
import org.meeting.pro.Services.Wrapper.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	UserService userService;
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping("/getUser") public ResponseEntity<Users>
	 * getUser(@RequestParam("id") String id){
	 * 
	 * System.out.println("id => "+id); Users u = new Users();
	 * u.setEmail("ddd.@gmail.com"); u.setFirstName("fff"); u.setLastName("ffdf");
	 * // u.setUid("2313"); ResponseEntity<Users> ru = new ResponseEntity<Users>(u,
	 * HttpStatus.OK); return ru; }
	 */
	
	@ResponseBody
	@RequestMapping(value = "/createUser" ,method=RequestMethod.POST)
	public ResponseEntity<Users> createUser(@RequestBody Users user){
		
		System.out.println("user => "+user);
		return userService.createUser(user);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getUser/{userid}" ,method=RequestMethod.GET)
	public ResponseEntity<Users> getUser(@PathVariable("userid") Integer userid){
		
		System.out.println("userid => "+userid);
		return userService.getUser(userid);
	}
	
	@ResponseBody
	@RequestMapping(value = "/updateUser" ,method=RequestMethod.PUT)
	public ResponseEntity<Users> getUser(@RequestBody Users user){
		
		System.out.println("user to update => "+user);
		return userService.updateUser(user);
	}
}
