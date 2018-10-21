package org.meeting.pro.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="rooms")
@Table(name = "rooms")
public class Rooms {

	@Id
	@GenericGenerator(name="r_id_generator" , strategy="custom.RoomIDGenerator")
	@GeneratedValue(generator = "r_id_generator")
	String r_id;
	String roomname;
	String floor;
	String roomno;
	String capacity;
	boolean hasprojector;
	type roomtype;
	public type getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(type roomtype) {
		this.roomtype = roomtype;
	}
	public String getR_id() {
		return r_id;
	}
	public void setR_id(String r_id) {
		this.r_id = r_id;
	}
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getRoomno() {
		return roomno;
	}
	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}
	public String getCapacity() {
		return capacity;
	}
	
	@Override
	public String toString() {
		return "Rooms [r_id=" + r_id + ", roomname=" + roomname + ", floor=" + floor + ", roomno=" + roomno
				+ ", capacity=" + capacity + ", hasprojector=" + hasprojector + ", roomtype=" + roomtype + "]";
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public boolean isHasprojector() {
		return hasprojector;
	}
	public void setHasprojector(boolean hasprojector) {
		this.hasprojector = hasprojector;
	}
	enum type {
		Seminar,meetingroom;
	}
	
	
}
