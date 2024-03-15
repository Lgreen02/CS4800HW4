package cs4800HW4.Part1;

public class PizzaDriver {
	public static void main(String[] args) {
		//Part 1
		String[] toppings1 = {"Cheese", "Pepperoni", "Onion"};
		String[] toppings2 = {"Beef", "BellPeppers", "Pepperoni", "Olives", "Spinach", "Bacon"};
		String[] toppings3 = {"Beef", "BellPeppers", "Pepperoni", "Olives", "Spinach", "Bacon", "Ham", "Pesto", "Mushrooms"};
		Pizza pizza1 = new PizzaHut().setSize("small").setToppingsArray(toppings1).makePizza();
		Pizza pizza2 = new PizzaHut().setSize("medium").setToppingsArray(toppings1).makePizza();
		Pizza pizza3 = new PizzaHut().setSize("large").setToppingsArray(toppings3).makePizza();
		pizza1.eat();
		pizza2.eat();
		pizza3.eat();
		
		//Part 2
		String[] phToppings1 = {"Cheese", "Pepperoni", "Onion"};
		String[] phToppings2 = {"Beef", "BellPeppers"};
		Pizza phPizza1 = new PizzaHut().setSize("Large").setToppingsArray(phToppings1).makePizza();
		Pizza phPizza2 = new PizzaHut().setSize("Small").setToppingsArray(phToppings2).makePizza();
		phPizza1.eat();
		phPizza2.eat();
		
		String[] lcToppings1 = {"Beef", "BellPeppers", "Pepperoni", "Olives", "Spinach", "Bacon", "Ham", "Pesto"};
		String[] lcToppings2 = {"Beef", "BellPeppers", "Pepperoni", "Olives", "Spinach", "Bacon"};
		Pizza lcPizza1 = new LittleCaesars().setSize("Medium").setToppingsArray(lcToppings1).makePizza();
		Pizza lcPizza2 = new LittleCaesars().setSize("Small").setToppingsArray(lcToppings2).makePizza();
		lcPizza1.eat();
		lcPizza2.eat();
		
		String[] dToppings1 = {"Extra Cheese"};
		String[] dToppings2 = {"Cheese", "Pepperoni", "Onion"};
		Pizza dPizza1 = new Dominos().setSize("Medium").setToppingsArray(dToppings1).makePizza();
		Pizza dPizza2 = new Dominos().setSize("Small").setToppingsArray(dToppings2).makePizza();
		dPizza1.eat();
		dPizza2.eat();
	}
}
