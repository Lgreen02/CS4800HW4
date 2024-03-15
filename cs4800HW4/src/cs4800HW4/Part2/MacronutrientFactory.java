package cs4800HW4.Part2;

import cs4800HW4.Part2.Carbs.Carb;
import cs4800HW4.Part2.Fats.Fat;
import cs4800HW4.Part2.Proteins.Protein;

public class MacronutrientFactory extends MacronutrientAbstractFactory{
	private static MacronutrientFactory instance;
	
	private MacronutrientFactory() {}
	@Override
	public Carb getCarb(String carbName) {
		// TODO Auto-generated method stub
		
		return CarbFactory.getInstance().createCarb(carbName);
	}

	@Override
	public Protein getProtein(String proteinName) {
		// TODO Auto-generated method stub
		return ProteinFactory.getInstance().createProtein(proteinName);
	}

	@Override
	public Fat getFat(String fatName) {
		// TODO Auto-generated method stub
		return FatFactory.getInstance().createFat(fatName);
	}
	public static MacronutrientFactory getInstance() {
		if(instance == null)
			instance = new MacronutrientFactory();
		return instance;
		
	}

}
