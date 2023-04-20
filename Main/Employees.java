package Main;
import java.util.List;
import java.util.Scanner;

public class Employees implements ICalculable{
	
	String name;
	String sur_name;
	double monthly_payment;
	int id;
	
	public Employees(String name, String surName, double monthlyPayment, int id){
		this.name = name;
		this.sur_name = surName;
		this.monthly_payment = monthlyPayment;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSur_name() {
		return sur_name;
	}

	public void setSur_name(String sur_name) {
		this.sur_name = sur_name;
	}

	public double getMonthly_payment() {
		return monthly_payment;
	}

	public void setMonthly_payment(double monthly_payment) {
		this.monthly_payment = monthly_payment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return monthly_payment;
	}
	
	public static void create_employee(List<ICalculable> calculable) {
		Scanner e = new Scanner(System.in);
		System.out.println("Name: ");
		String name = e.nextLine();
		System.out.println("Surname: ");
		String sur_name = e.nextLine();
		System.out.println("ID: ");
		int id = e.nextInt();
		System.out.println("Monthly Payment: ");
		double month_pay = e.nextDouble();
		
		Employees employee = new Employees(name, sur_name, month_pay, id);
		calculable.add(employee);
		
	}
	
	
}

















