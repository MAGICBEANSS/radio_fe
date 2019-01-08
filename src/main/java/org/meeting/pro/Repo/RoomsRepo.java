package org.meeting.pro.Repo;

import org.meeting.pro.Entity.Rooms;
import org.springframework.http.ResponseEntity;

public interface RoomsRepo {
	abstract public ResponseEntity<Rooms> createRoom(Rooms r);

	public abstract ResponseEntity<Rooms> updateRoom(Rooms room);

	public abstract ResponseEntity<Rooms> getRoom(String room_id);

	public abstract ResponseEntity<Rooms> deleteRoom(String room_id);

}
