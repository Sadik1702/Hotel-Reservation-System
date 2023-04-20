package Abstract;

public class Spa extends Services{
	int days;
	double spa_cost;
	
	@Override
	public String get_service_type() {
		return "Spa";
	}
	
	@Override
	public double calculate_service() {
		double total_spa_cost = this.days * 100;
		return total_spa_cost;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public double getSpa_cost() {
		return spa_cost;
	}

	public void setSpa_cost(double spa_cost) {
		this.spa_cost = spa_cost;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return spa_cost;
	}
	
	
	
}
