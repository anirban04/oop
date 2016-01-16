package FactoryMethodPattern;

public class NyStyleVeggiePizza extends Pizza {
	
	public NyStyleVeggiePizza() {
		this.name = "NyStyleVeggiePizza";
		this.dough = "thin crust dough";
		this.sauce = "marinara sauce";
		this.toppings.add("onions");
		this.toppings.add("red peppers");
		this.toppings.add("mushrooms");
	}
}

