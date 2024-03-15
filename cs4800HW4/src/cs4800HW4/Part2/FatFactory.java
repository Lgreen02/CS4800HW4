package cs4800HW4.Part2;

import cs4800HW4.Part2.Fats.*;

public class FatFactory {
	private static FatFactory instance;
	
	private FatFactory() {}
	
	public Fat createFat(String name) {
		switch(name) {
		case "avacado":
			return new Avacado();
			
		case "tuna":
			return new Tuna();
			
		case "sourcream":
			return new SourCream();
			
		case "peanuts":
			return new Peanuts();
		default:
			return null;
		}
	}
	public static FatFactory getInstance() {
		if(instance == null)
			instance = new FatFactory();
		return instance;
	}


}
