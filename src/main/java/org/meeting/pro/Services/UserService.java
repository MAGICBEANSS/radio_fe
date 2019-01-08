package org.meeting.pro.Services;

import org.meeting.pro.Entity.Users;
import org.springframework.http.ResponseEntity;

public interface UserService {

	ResponseEntity<Users> createUser(Users user);

	ResponseEntity<Users> getUser(Integer userid);

	ResponseEntity<Users> updateUser(Users user);

}
