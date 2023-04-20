package Abstract;

public class Laundry extends Services {
	int clothing_pieces;
	double laundry_cost;
	
	@Override
	public String get_service_type() {
		return "Laundry";
	}
	
	@Override
	public double calculate_service() {
		 double total_laundry_cost = this.clothing_pieces * 20;
		 return total_laundry_cost;
	}

	public int getClothing_pieces() {
		return clothing_pieces;
	}

	public void setClothing_pieces(int clothing_pieces) {
		this.clothing_pieces = clothing_pieces;
	}

	public double getLaundry_cost() {
		return laundry_cost;
	}

	public void setLaundry_cost(double laundry_cost) {
		this.laundry_cost = laundry_cost;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return laundry_cost;
	}
	
}
