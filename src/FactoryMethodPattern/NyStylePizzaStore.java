package FactoryMethodPattern;

public class NyStylePizzaStore extends PizzaStore {
	
	protected Pizza createPizza(String type) {
		if (type.equals("Cheese"))
			return new NyStyleCheesePizza();
		if (type.equals("veggie"))
			return new NyStyleVeggiePizza();
		if (type.equals("Meat"))
			return new NyStyleMeatPizza();
		else
			return null;
	}
}
