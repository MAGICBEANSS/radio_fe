package org.meeting.pro.Services.Wrapper;

import org.meeting.pro.Entity.Rooms;
import org.springframework.http.ResponseEntity;

public interface RoomService {
	abstract public ResponseEntity<Rooms> createRoom(Rooms r);

	public abstract ResponseEntity<Rooms> updateRoom(Rooms room);

	public abstract ResponseEntity<Rooms> getRoom(String room_id);

	public abstract ResponseEntity<Rooms> deletetRoom(String room_id);

}
