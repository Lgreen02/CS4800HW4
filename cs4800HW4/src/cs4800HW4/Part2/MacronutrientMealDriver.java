package cs4800HW4.Part2;

public class MacronutrientMealDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealFactory mealFactory = MealFactory.getInstance();
		
		Customer customer1 = new Customer("Carson", "paleo");
		Customer customer2 = new Customer("Paul", "no restrictions");
		Customer customer3 = new Customer("Chani", "vegan");
		Customer customer4 = new Customer("Leto", "nut allergy");
		Customer customer5 = new Customer("Stilgar", "paleo");
		Customer customer6 = new Customer("Feyd", "no restrictions");
		
		mealFactory.createMeal(customer1);
		mealFactory.createMeal(customer2);
		mealFactory.createMeal(customer3);
		mealFactory.createMeal(customer4);
		mealFactory.createMeal(customer5);
		mealFactory.createMeal(customer6);
		
	}
	
}
