package org.meeting.pro.Services.Impl;

import org.meeting.pro.Entity.Users;
import org.meeting.pro.Repo.UsersRepo;
import org.meeting.pro.Services.UserService;
import org.meeting.pro.Services.Wrapper.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UsersRepo usersrespo;
	public ResponseEntity<Users> createUser(Users user) {
		// TODO Auto-generated method stub
		return usersrespo.createUser(user);
	}
	public ResponseEntity<Users> getUser(Integer userid) {
		// TODO Auto-generated method stub
		return usersrespo.getUser(userid);
	}
	public ResponseEntity<Users> updateUser(Users user) {
		// TODO Auto-generated method stub
		return usersrespo.updateUser(user);
	}

}
