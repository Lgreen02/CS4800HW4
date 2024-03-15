package cs4800HW4.Part2;

public class Customer {
	private String name;
	private String dietPlan;
	
	public Customer(String name, String dietPlan) {
		this.name = name;
		this.dietPlan = dietPlan;
	}
	public String getName() {
		return this.name;
	}
	public String getDietPlan() {
		return this.dietPlan;
	}
}
