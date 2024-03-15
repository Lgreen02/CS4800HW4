package cs4800HW4.Part1;

public class Pizza {
	private String chain;
	private String size;
	
	private String[] toppingsArray;
	
	public Pizza(String chain, String size, String[] toppingsArray) {
		this.chain = chain;
		this.size = size;
		this.toppingsArray = toppingsArray;
	}
	public void eat() {
		System.out.print("Chain: " + chain + " Size: " + size + " Toppings: " );
		for(int i = 0; i<toppingsArray.length; i++)
			System.out.print(toppingsArray[i] + " ");
		System.out.println();
	}
	
}
