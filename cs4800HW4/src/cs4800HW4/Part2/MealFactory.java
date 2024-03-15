package cs4800HW4.Part2;

import java.util.Random;

import cs4800HW4.Part2.Carbs.Carb;
import cs4800HW4.Part2.Fats.Fat;
import cs4800HW4.Part2.Proteins.Protein;

public class MealFactory {
	private Carb carb;
	private Protein protein;
	private Fat fat;
	private Customer customer;
	private MacronutrientFactory mealFactory = MacronutrientFactory.getInstance();
	private static MealFactory instance;
	
	
	private MealFactory() {}
	public static MealFactory getInstance() {
		if(instance == null)
			instance = new MealFactory();
		return instance;
	}
	
	public void createMeal(Customer customer) {
		this.customer = customer;
		String dietPlan = customer.getDietPlan();
		
		this.fat = randomFat(dietPlan);
		this.protein = randomProtein(dietPlan);
		this.carb = randomCarb(dietPlan);
		//carb.printName();
		printMeal();
	}
	
	private Carb randomCarb(String dietPlan) {
		// TODO Auto-generated method stub
		String carbName;
		Random rand = new Random();
		int index;
		
		switch(dietPlan) {
		case "no restrictions":
			String[] noRestrictions = {"cheese", "bread", "lentils", "pistachios"};
			index = rand.nextInt(4);
			carbName = noRestrictions[index];
			return mealFactory.getCarb(carbName);
			
		case "paleo":
			return mealFactory.getCarb("pistachios");
			
		case "vegan":
			String[] vegan = {"bread", "lentils", "pistachios"};
			index = rand.nextInt(3);
			carbName = vegan[index];
			return mealFactory.getCarb(carbName);
			
		case "nut allergy":
			String[] nutAllergy = {"cheese", "bread", "lentils"};
			index = rand.nextInt(3);
			carbName = nutAllergy[index];
			return mealFactory.getCarb(carbName);
			
		default:
			return null;
			
		}
		
	}

	private Protein randomProtein(String dietPlan) {
		// TODO Auto-generated method stub
		String proteinName;
		Random rand = new Random();
		int index;
		
		switch(dietPlan) {
		case "no restrictions":
			String[] noRestrictions = {"fish", "chicken", "beef", "tofu"};
			index = rand.nextInt(4);
			proteinName = noRestrictions[index];
			return mealFactory.getProtein(proteinName);
			
		case "paleo":
			String[] paleo = {"fish", "chicken", "beef"};
			index = rand.nextInt(3);
			proteinName = paleo[index];
			return mealFactory.getProtein(proteinName);
			
		case "vegan":
			return mealFactory.getProtein("tofu");
			
		case "nut allergy":
			String[] nutAllergy = {"fish", "chicken", "beef", "tofu"};
			index = rand.nextInt(4);
			proteinName = nutAllergy[index];
			return mealFactory.getProtein(proteinName);
			
		default:
			return null;
		}
	}

	private Fat randomFat(String dietPlan) {
		// TODO Auto-generated method stub
		String fatName;
		Random rand = new Random();
		int index;
		
		switch(dietPlan) {
		case "no restrictions":
			String[] noRestrictions = {"avacado", "sourcream", "tuna", "peanuts"};
			index = rand.nextInt(4);
			fatName = noRestrictions[index];
			return mealFactory.getFat(fatName);
			
		case "paleo":
			String[] paleo = {"avacado", "tuna", "peanuts"};
			index = rand.nextInt(3);
			fatName = paleo[index];
			return mealFactory.getFat(fatName);
			
		case "vegan":
			String[] vegan = {"avacado", "peanuts"};
			index = rand.nextInt(2);
			fatName = vegan[index];
			return mealFactory.getFat(fatName);
			
		case "nut allergy":
			String[] nutAllergy = {"avacado", "sourcream", "tuna"};
			index = rand.nextInt(3);
			fatName = nutAllergy[index];
			return mealFactory.getFat(fatName);
			
		default:
			return null;
		}
	}

	public void printMeal() {
		System.out.print("Cutomer: " + customer.getName() + "\n    Diet Plan: " + 
				customer.getDietPlan() + "\n\tCarb: " );
		carb.printName();
		System.out.print("\n\tProtein: ");
		protein.printName();
		System.out.print("\n\tFat: ");
		fat.printName();
		System.out.println("\n");
	}

}
