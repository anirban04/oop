package FactoryMethodPattern;

public class ChicagoStyleVeggiePizza extends Pizza {
	
	public ChicagoStyleVeggiePizza() {
		this.name = "ChicagoStyleVeggiePizza";
		this.dough = "thick crust dough";
		this.sauce = "plum tomato sauce";
		this.toppings.add("eggplant");
		this.toppings.add("spinach");
		this.toppings.add("black olives");
	}
}

