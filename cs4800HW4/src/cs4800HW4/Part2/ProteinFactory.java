package cs4800HW4.Part2;


import cs4800HW4.Part2.Proteins.*;

public class ProteinFactory {
private static ProteinFactory instance;
	
	private ProteinFactory() {}
	
	public Protein createProtein(String name) {
		switch(name) {
		case "fish":
			return new Fish();
			
		case "chicken":
			return new Chicken();
			
		case "beef":
			return new Beef();
			
		case "tofu":
			return new Tofu();
		default:
			return null;
		}
	}
	

	public static ProteinFactory getInstance() {
		// TODO Auto-generated method stub
		if(instance == null)
			instance = new ProteinFactory();
		return instance;
		
	}

}
