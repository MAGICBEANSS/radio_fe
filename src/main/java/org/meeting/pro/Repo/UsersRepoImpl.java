package org.meeting.pro.Repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.meeting.pro.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class UsersRepoImpl implements UsersRepo {

	@Autowired
	 private SessionFactory sessionFactory;
	
	 
	 
	public Session getSession() {
		Session s = sessionFactory.openSession();
		return s;
	}
	public ResponseEntity<Users> createUser(Users user) {
		// TODO Auto-generated method stub
		Session session = getSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		return new ResponseEntity<Users>(user,HttpStatus.OK);
	}
	public ResponseEntity<Users> getUser(Integer userid) {
		// TODO Auto-generated method stub
		Session session = getSession();
		session.beginTransaction();
		Users user = session.get(Users.class, userid);
		session.getTransaction().commit();
		session.close();
		if(user==null) {
			return new ResponseEntity<Users>(user,HttpStatus.NOT_FOUND); 
		}
		return new ResponseEntity<Users>(user,HttpStatus.OK);
		
	}
	public ResponseEntity<Users> updateUser(Users user) {
		// TODO Auto-generated method stub
		Session session = getSession();
		session.beginTransaction();
		Users temp = session.get(Users.class, user.getUid());
		if(temp == null) {
			session.merge(user);
			user.setUid(user.getUid());
			session.getTransaction().commit();
			session.close();
			return new ResponseEntity<Users>(user,HttpStatus.CREATED);
		}
		session.merge(user);
		session.getTransaction().commit();
		session.close();
		return new ResponseEntity<Users>(user,HttpStatus.NO_CONTENT);
		
		
	}

}
