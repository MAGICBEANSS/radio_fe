package org.meeting.pro.Repo;

import org.meeting.pro.Entity.Rooms;
import org.springframework.http.ResponseEntity;

public interface RoomsRepo {
	abstract public ResponseEntity<Rooms> createRoom(Rooms r);

}
