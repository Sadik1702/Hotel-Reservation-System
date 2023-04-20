package Main;


public enum Menu_Options {
	
	Create_new_Res_w_Room_Type(1, "\n1. Create new Reservation with Room Type"),
	Display_all_Res(2, "2. Display all Reservations"),
	List_res_for_city(3, "3. List the reservations for a specific city"),
	Add_extra_services(4, "4. Add extra services to a reservation"),
	Calculate_each_service(5, "5. Calculate total cost for each service"),
	Display_cost_of_customer(6, "6. Display the total cost of every customer"),
	Add_employee(7, "7. Add an employee"),
	Add_bill(8, "8. Add a bill"),
	Get_monthly_balance(9, "9. Get monthly balance"),
	Exit(10, "10. Exit");


	private int number;
	private final String option;
	
	
	Menu_Options(int num, String choice) {
		option = choice;
		number = num;
	}
	
	public String getOption() {
		return option;
	}
	
	public int getNumber() {
		return number;
	}
	
	
}
