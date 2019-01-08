package org.meeting.pro.Services.Impl;

import org.meeting.pro.Entity.Rooms;
import org.meeting.pro.Repo.RoomsRepo;
import org.meeting.pro.Services.Wrapper.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	RoomsRepo roomsrepo;
	public ResponseEntity<Rooms> createRoom(Rooms r) {
		// TODO Auto-generated method stub
		return roomsrepo.createRoom(r);
		// return null;
	}
	public ResponseEntity<Rooms> updateRoom(Rooms room) {
		// TODO Auto-generated method stub
		return roomsrepo.updateRoom(room);
	}
	public ResponseEntity<Rooms> getRoom(String room_id) {
		// TODO Auto-generated method stub
		return roomsrepo.getRoom(room_id);
	}
	public ResponseEntity<Rooms> deletetRoom(String room_id) {
		// TODO Auto-generated method stub
		return roomsrepo.deleteRoom(room_id);
		}

}
