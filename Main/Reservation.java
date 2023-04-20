package Main;

import Abstract.Laundry;
import Abstract.Spa;
import Abstract.Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Reservation extends Services {
	
	private Room room;
	private String hotel_name;
	private String reservation_month;
	private int reservation_start;
	private int reservation_end;
	static int total_num_of_reservations = 0;
	
	

	public Reservation(String hotel_name, String reservation_month,	
			int reservation_start, int reservation_end,	int daily_cost, Room room, int res_id) {
		
		this.hotel_name = hotel_name;
		this.reservation_month = reservation_month;
		this.reservation_start = reservation_start;
		this.reservation_end = reservation_end;
		this.room = room;			
	
	}
	

	public void setTotal_num_of_reservations() {
		total_num_of_reservations++;
	}
	
	public  int getTotal_num_of_reservations() {
		return total_num_of_reservations;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getReservation_month() {
		return reservation_month;
	}

	public void setReservation_month(String reservation_month) {
		this.reservation_month = reservation_month;
	}

	public int getReservation_start() {
		return reservation_start;
	}

	public void setReservation_start(int reservation_start) {
		this.reservation_start = reservation_start;
	}

	public int getReservation_end() {
		return reservation_end;
	}

	public void setReservation_end(int reservation_end) {
		this.reservation_end = reservation_end;
	}
	
	public static void create_reservation(List<Reservation> reservations, List<Services> services, List<ICalculable> calculables ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nROOM INFOS:\n\n");					
		Room.display_room_infos();
		
		System.out.print("\n Hotel Name: ");
		String hotel_name = sc.nextLine();
		
		System.out.print(" Room Type: ");
		String room_type = sc.next();
	
		System.out.print(" Reservation Month: ");
		String reservation_month = sc.next();
		
		System.out.print(" Reservation Start: ");
		int reservation_start = sc.nextInt();

		System.out.print(" Reservation End: ");
		int reservation_end = sc.nextInt();
		
		int res_id = Reservation.total_num_of_reservations+1;
		
		if(room_type.equals("Single")) {
			Single_Room room = new Single_Room();
			Reservation reservation = new Reservation(hotel_name, reservation_month, reservation_start, 
					reservation_end, 100, room, res_id);
			reservations.add(reservation);
			services.add(reservation);
			calculables.add(reservation);
			reservation.setCustomer_ID(res_id);
			reservation.setTotal_num_of_reservations();
		}
		
		else if(room_type.equals("Double")) {
			Double_Room room = new Double_Room();
			Reservation reservation = new Reservation(hotel_name, reservation_month, reservation_start, 
					reservation_end, 180, room, res_id);
			reservations.add(reservation);
			services.add(reservation);
			calculables.add(reservation);
			reservation.setCustomer_ID(res_id);
			reservation.setTotal_num_of_reservations();
		}
		
		else if(room_type.equals("Club")) {
			Club_Room room = new Club_Room();
			Reservation reservation = new Reservation(hotel_name, reservation_month, reservation_start, 
					reservation_end, 250, room, res_id);
			reservations.add(reservation);
			services.add(reservation);
			calculables.add(reservation);
			reservation.setCustomer_ID(res_id);
			reservation.setTotal_num_of_reservations();
		}
		
		else if(room_type.equals("Family")) {
			Family_Room room = new Family_Room();
			Reservation reservation = new Reservation(hotel_name, reservation_month, reservation_start, 
					reservation_end, 400, room, res_id);
			reservations.add(reservation);
			services.add(reservation);
			calculables.add(reservation);
			reservation.setCustomer_ID(res_id);
			reservation.setTotal_num_of_reservations();
		}
		
		else if(room_type.equals("Family With View")) {
			Family_View_Room room = new Family_View_Room();
			Reservation reservation = new Reservation(hotel_name, reservation_month, reservation_start, 
					reservation_end, 450, room, res_id);
			reservations.add(reservation);
			services.add(reservation);
			calculables.add(reservation);
			reservation.setCustomer_ID(res_id);
			reservation.setTotal_num_of_reservations();
		}
		
		else if(room_type.equals("Suite")) {
			Suite_Room room = new Suite_Room();
			Reservation reservation = new Reservation(hotel_name, reservation_month, reservation_start, 
					reservation_end, 650, room, res_id);
			reservations.add(reservation);
			services.add(reservation);
			calculables.add(reservation);
			reservation.setCustomer_ID(res_id);
			reservation.setTotal_num_of_reservations();
		}
		System.out.printf("\nReservation ID: %d is created!\n\n", res_id);
	}
		
	public void display_reservation_info() {
		System.out.printf("\n\nReservation for a %s room in %s starts on %s %d and ends on %s %d"
			+ ".\nReservation has a total cost of $%,.2f.", 
			room.getRoom_type(), getHotel_name(), getReservation_month(), getReservation_start(),
			getReservation_month(), getReservation_end(), this.calculate_service() );
	}
	
	public static void display_all_reservations(List<Reservation> reservations) {
		if(Reservation.total_num_of_reservations==0) {
			System.out.println("There is no reservation yet.");
		}
		else{
			for (int j=0; j < Reservation.total_num_of_reservations; j++) {
			reservations.get(j).display_reservation_info();
			}
			System.out.print("\n\n");
		}
	}
		
	public static void list_reservations_for_city(List<Reservation> reservations) {
		Scanner c = new Scanner(System.in);							
		System.out.print("\n\n Type a city name for a reservation search: ");
		String city = c.nextLine();
		
		List<Reservation> cities = new ArrayList<Reservation>();		
		for(int i=0; i<Reservation.total_num_of_reservations; i++) {
			cities.add(reservations.get(i));
		}
		
		Iterator<Reservation> iterator1 = cities.iterator();
		Iterator<Reservation> iterator2 = cities.iterator();
		while(iterator1.hasNext()){
			if(iterator2.next().getHotel_name().contains(city)) {
				System.out.println(iterator1.next().getHotel_name()); 
			}
			else {
				iterator1.next();
			}
		}
		
		System.out.print("\n");
	}
	
	/*public double calculate_total_price(int number) {
		double  total_price;
		total_price = number * (room.getDaily_cost() * (getReservation_end() - getReservation_start()));
		return total_price;
	}
	
	public double  calculate_total_price() {
		double  total_price;
		total_price = room.getDaily_cost() * (getReservation_end() - getReservation_start());
		return total_price;
		}*/
	
	public static void add_extra_service(List<Reservation> reservations, List<Services> services, List<ICalculable> calculables){
		Scanner service = new Scanner(System.in);
		System.out.print("\nPlease select one of the extra services from below:\n"
				+ "1. Laundry Service\n2. Spa Service\n");
		int ser = service.nextInt(), id, pieces, days;;
		double cost;
		
		if(ser == 1) {//Laundry Service
			System.out.println("\nType the reservation ID to credit this service: ");
			id = service.nextInt();
			
			System.out.println("How many pieces of clothing?");
			pieces = service.nextInt();
			
			Laundry laundry = new Laundry();
			for(Reservation res : reservations) {
				if(id == res.getCustomer_ID()) {
					laundry.setCustomer_ID(id);
					laundry.setClothing_pieces(pieces);
					laundry.setLaundry_cost(laundry.calculate_service());
					services.add(laundry);
					calculables.add(laundry);
					continue;
				}
			}
		}
		else if(ser == 2){//Spa Service
			System.out.println("\nType the reservation ID to credit this service: ");
			id = service.nextInt();
			
			System.out.println("How many days?");
			days = service.nextInt();
			
			Spa spa = new Spa();
			for(Reservation res : reservations) {
				if(id == res.getCustomer_ID()) {
					spa.setCustomer_ID(id);
					spa.setDays(days);
					spa.setSpa_cost(spa.calculate_service());
					services.add(spa);
					calculables.add(spa);
					continue;
				}
			}
		}
		else {
			System.out.println("\n Invalid number");
			System.out.println("\n");
		}
		
		
		System.out.println("\n");
	}

	public static void calculate_cost_each_service(List<Services> services) {		
		
		for(Services service : services) {
				System.out.printf("The cost for the %s service of reservation ID %d: $%,.2f\n",
						service.get_service_type(), service.getCustomer_ID(), service.calculate_service());
			}		 
	}
	
	public static double calculate_cost_each_service_for_month(List<Reservation> reservations, List<Services> services, String month) {
		double monthly_income=0;
		for(Reservation res : reservations) {
			if(res.getReservation_month()==month) {
				for(Services service :services) {
					if(service.getCustomer_ID() == res.getCustomer_ID()) {
						System.out.printf("For reservation ID: %d, Service type: %s, Serv,ce Cost: %,.2f\n",
								service.getCustomer_ID(), service.get_service_type(), service.getCost());
						monthly_income += service.getCost();
					}
				}
			}
		}
		return monthly_income;
	}

	public static void display_total_cost(List<Reservation> reservations, List<Services> services) {
		for(Reservation res : reservations) {
			double service_cost=0;
			for(Services ser : services) {
				if(res.getCustomer_ID() == ser.getCustomer_ID()) {
					service_cost += ser.getCost();
				}
				else {
					continue;
				}
			}
			System.out.printf("The total cost of all services of the reservation with ID: %d is $%,.2f\n", res.getCustomer_ID(), service_cost);
		}
	}

	@Override
	public String get_service_type() {
		return "Room booking";
	}

	@Override
	public double calculate_service() {
		double total_price=0;
		if(getReservation_month().equals("June")||getReservation_month().equals("July")||getReservation_month().equals("August")) {
			total_price = 2 * (room.getDaily_cost() * (getReservation_end() - getReservation_start()));
		}
		else {
			total_price = room.getDaily_cost() * (getReservation_end() - getReservation_start());
		}
		return total_price;
	}


	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return calculate_service();
	}
}
	









