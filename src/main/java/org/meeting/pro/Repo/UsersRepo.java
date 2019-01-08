package org.meeting.pro.Repo;

import org.meeting.pro.Entity.Users;
import org.springframework.http.ResponseEntity;

public interface UsersRepo {

	ResponseEntity<Users> createUser(Users user);

	ResponseEntity<Users> getUser(Integer userid);

	ResponseEntity<Users> updateUser(Users user);

}
