package Main;

import java.util.Scanner;

public class Room {
	protected String room_type;
	protected int daily_cost;
	protected int room_size;
	protected Boolean has_bath;
	
	public Room(String room_type, int daily_cost, Boolean has_bath, int room_size) {
		
		this.room_type = room_type;
		this.daily_cost = daily_cost;
		this.has_bath = has_bath;
		this.room_size = room_size;
		
		
	}
	
	public static void display_room_infos() {		
		
		String[] rooms = new String[6];
		
		rooms[0] = "Room Type: Single, Daily Cost: 100, Room Size: 15, Has Bath: false";
		rooms[1] = "Room Type: Double, Daily Cost: 180, Room Size: 30, Has Bath: false";
		rooms[2] = "Room Type: Club, Daily Cost: 250, Room Size: 45, Has Bath: true";
		rooms[3] = "Room Type: Family, Daily Cost: 400, Room Size: 50, Has Bath: false";
		rooms[4] = "Room Type: Family With View, Daily Cost: 450, Room Size: 60, Has Bath: true";
		rooms[5] = "Room Type: Suite, Daily Cost: 650, Room Size: 80, Has Bath: true";
		
		for(int i=0; i<6; i++){
			System.out.println(rooms[i]);
		}
		
	}
	
	public String toStringRoom(Room room){
			return String.format("Room Type: %s, Daily Cost: %d, Room Size: %d, Has Bath: %b", 
					room.getRoom_type(), room.getDaily_cost(), room.getRoom_size(), room.getHas_bath());
		}

	
	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public int getDaily_cost() {
		return daily_cost;
	}

	public void setDaily_cost(int daily_cost) {
		this.daily_cost = daily_cost;
	}

	public int getRoom_size() {
		return room_size;
	}

	public void setRoom_size(int room_size) {
		this.room_size = room_size;
	}

	public Boolean getHas_bath() {
		return has_bath;
	}

	public void setHas_bath(Boolean has_bath) {
		this.has_bath = has_bath;
	}
}



