package cs4800HW4.Part2;

import cs4800HW4.Part2.Carbs.Bread;
import cs4800HW4.Part2.Carbs.Carb;
import cs4800HW4.Part2.Carbs.Cheese;
import cs4800HW4.Part2.Carbs.Lentils;
import cs4800HW4.Part2.Carbs.Pistachios;

public class CarbFactory {
	private static CarbFactory instance;
	
	private CarbFactory() {}
	
	public Carb createCarb(String name) {
		
		switch(name) {
		case "cheese":
			return new Cheese();
			
		case "bread":
			return new Bread();
			
		case "lentils":
			return new Lentils();
			
		case "pistachios":
			return new Pistachios();
			
		default:
			return null;
		}
	}
	public static CarbFactory getInstance() {
		if(instance == null)
			instance = new CarbFactory();
		return instance;
	}

}
