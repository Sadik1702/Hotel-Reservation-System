package Main;

import Abstract.Services;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ReservationUI {

	public static void main(String[] args) {
		
		List<Reservation> reservations = new ArrayList<Reservation>();
		List<Services> services = new ArrayList<Services>();
		List<ICalculable> calculables = new ArrayList<ICalculable>();
				
		boolean exit = false;
		while (!exit) {
				Scanner sc = new Scanner(System.in);
				Scanner menu = new Scanner(System.in);
				for(Menu_Options option : Menu_Options.values()){
					System.out.println(option.getOption());
				}
				int n = menu.nextInt();
						
				
				if(n == Menu_Options.Create_new_Res_w_Room_Type.getNumber()){
					Reservation.create_reservation(reservations, services, calculables);
					continue;
				}
				
				
				else if(n == Menu_Options.Display_all_Res.getNumber()) {
					Reservation.display_all_reservations(reservations);					
					continue;
				}

				
				else if(n == Menu_Options.List_res_for_city.getNumber()){
					Reservation.list_reservations_for_city(reservations);
					continue;
				}
				
				else if(n == Menu_Options.Add_extra_services.getNumber()){
					Reservation.add_extra_service(reservations, services, calculables);
					continue;
				}
				
				else if(n == Menu_Options.Calculate_each_service.getNumber()){						
					Reservation.calculate_cost_each_service(services);
					
					continue;
					
				}
				
				else if(n == Menu_Options.Display_cost_of_customer.getNumber()){
					Reservation.display_total_cost(reservations, services);

					continue;
				}
				
				else if(n == Menu_Options.Add_employee.getNumber()){
					Employees.create_employee(calculables);

				continue;
				}
				
				else if(n == Menu_Options.Add_bill.getNumber()){
					Bills.create_bill(calculables);
					

				continue;
				}
				
				else if(n == Menu_Options.Get_monthly_balance.getNumber()){
					Scanner m = new Scanner(System.in);
					System.out.println("Enter Month: ");
					String month = m.nextLine();
					double income = Reservation.calculate_cost_each_service_for_month(reservations, services, month);
					System.out.printf("Total monthly income: %,.2f\n", income);
					
					for(ICalculable calculable : calculables) {
						
					}

				continue;
				}
				
				else if(n == Menu_Options.Exit.getNumber()){
					System.out.println("\n Good Bye...");
					exit = true;
					continue;
				}
				
				else {
					System.out.println("\n Invalid number\n Please enter again\n");
					System.out.println("\n");
					continue;
				}
			}
	}
}
