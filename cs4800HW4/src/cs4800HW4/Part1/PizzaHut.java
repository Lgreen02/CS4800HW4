package cs4800HW4.Part1;

public class PizzaHut {
	private String chain = "PizzaHut";
	private String size;
	
	private String[] toppingsArray;
	
	public PizzaHut() {
	}
	
	public PizzaHut setSize(String size) {
		if(validSize(size))
			this.size = size;
		return this;
	}
	private boolean validSize(String size) {
		String sizeCheck = size.toLowerCase();
		return sizeCheck.equals("small") || sizeCheck.equals("medium") || sizeCheck.equals("large");
	}
	public PizzaHut setToppingsArray(String[] toppingsArray) {
		this.toppingsArray = toppingsArray;
		return this;
	}
	public Pizza makePizza() {
		return new Pizza(chain, size, toppingsArray);
	}
}
