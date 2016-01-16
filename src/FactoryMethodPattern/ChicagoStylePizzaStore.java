package FactoryMethodPattern;

public class ChicagoStylePizzaStore extends PizzaStore {
	
	protected Pizza createPizza(String type) {
		if (type.equals("Cheese"))
			return new ChicagoStyleCheesePizza();
		if (type.equals("veggie"))
			return new ChicagoStyleVeggiePizza();
		if (type.equals("Meat"))
			return new ChicagoStyleMeatPizza();
		else
			return null;
	}
}
