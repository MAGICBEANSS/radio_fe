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
@Transactional
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
	//	ss.beginTransaction();
		
		 ss.save(r);
		// ss.getTransaction().commit();
	//	 ss.close();
		return new ResponseEntity<Rooms>(r, HttpStatus.OK);
	}


	public ResponseEntity<Rooms> updateRoom(Rooms room) {
		// TODO Auto-generated method stub
		Session ss = getSession();
		ss.beginTransaction();
		Rooms temp = ss.get(Rooms.class, room.getR_id());
		if(temp != null ) {
			ss.merge(room);
			 ss.getTransaction().commit();
			 ss.close();
			return new ResponseEntity<Rooms>(room, HttpStatus.NO_CONTENT);
		}
		else
		{
			ss.save(room);
			 ss.getTransaction().commit();
			 ss.close();
			return new ResponseEntity<Rooms>(room, HttpStatus.CREATED);
			
		}
		
		
		
	}


	public ResponseEntity<Rooms> getRoom(String room_id) {
		Session session = getSession();
		session.beginTransaction();
		Rooms room = session.get(Rooms.class, room_id);
		if(room != null) {
		session.getTransaction().commit();
		session.close();
		return new ResponseEntity<Rooms>(room,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Rooms>(room,HttpStatus.OK);
		
	}


	public ResponseEntity<Rooms> deleteRoom(String room_id) {
		// TODO Auto-generated method stub
		Session session = getSession();
		session.beginTransaction();
		Rooms room = session.get(Rooms.class, room_id);
		if(room != null ) {
		session.delete( room);
		session.getTransaction().commit();
		session.close();
		return new ResponseEntity<Rooms>(room,HttpStatus.OK);
		}
		return new ResponseEntity<Rooms>(room,HttpStatus.NOT_FOUND);
		
	}

}
