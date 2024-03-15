package cs4800HW4.Part1;

public class LittleCaesars {
	private String chain = "Little Caesar's";
	private String size;
	
	private String[] toppingsArray;
	
	public LittleCaesars() {
	}
	
	public LittleCaesars setSize(String size) {
		if(validSize(size))
			this.size = size;
		return this;
	}
	private boolean validSize(String size) {
		String sizeCheck = size.toLowerCase();
		return sizeCheck.equals("small") || sizeCheck.equals("medium") || sizeCheck.equals("large");
	}
	public LittleCaesars setToppingsArray(String[] toppingsArray) {
		this.toppingsArray = toppingsArray;
		return this;
	}
	public Pizza makePizza() {
		return new Pizza(chain, size, toppingsArray);
	}
}
