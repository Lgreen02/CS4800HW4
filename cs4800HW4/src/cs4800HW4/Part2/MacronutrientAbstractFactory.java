package cs4800HW4.Part2;

import cs4800HW4.Part2.Carbs.Carb;
import cs4800HW4.Part2.Fats.Fat;
import cs4800HW4.Part2.Proteins.Protein;

public abstract class MacronutrientAbstractFactory {
	public abstract Carb getCarb(String mealPlan);
	public abstract Protein getProtein(String mealPlan);
	public abstract Fat getFat(String mealPlan);
}
