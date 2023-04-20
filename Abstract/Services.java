package Abstract;
import Main.ICalculable;

public abstract class Services implements ICalculable{
	int customer_ID;
	
	public abstract String get_service_type();
	
	public abstract double calculate_service();
	
	public int getCustomer_ID() {
		return customer_ID;
	}

	public void setCustomer_ID(int customer_ID) {
		this.customer_ID = customer_ID;
	}
	
}
