package org.meeting.pro.Repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.meeting.pro.Entity.Rooms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class RoomsRepoImpl implements RoomsRepo {

	 @Autowired
	 private SessionFactory sessionFactory;
	
	 
	 
	public Session getSession() {
		Session s = sessionFactory.openSession();
		return s;
	}


	public ResponseEntity<Rooms> createRoom(Rooms r) {
		// TODO Auto-generated method stub
		Session ss = getSession();
		ss.beginTransaction();
		 ss.save(r);
		 ss.getTransaction().commit();
		 ss.close();
		return new ResponseEntity<Rooms>(r, HttpStatus.OK);
	}

}
