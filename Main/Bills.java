package Main;

import java.util.List;
import java.util.Scanner;

public class Bills implements ICalculable{
	
	String type;
	double amount;
	String month;
	
	public Bills(String type, double amount, String month) {
		this.type = type;
		this.amount = amount;
		this.month = month;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return amount;
	}
	
	public static void create_bill(List<ICalculable> calculable) {
		Scanner b = new Scanner(System.in);
		Scanner b2 = new Scanner(System.in);
		System.out.println("Type: ");
		String type = b.nextLine();
		System.out.println("Amount: ");
		double amount = b.nextInt();
		System.out.println("Month: ");
		String month = b2.nextLine();
		
		Bills bill = new Bills(type, amount, month);
		calculable.add(bill);
		
	}
	
}
