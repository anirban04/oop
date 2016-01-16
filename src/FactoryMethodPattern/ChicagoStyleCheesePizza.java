package FactoryMethodPattern;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		this.name = "ChicagoStyleCheesePizza";
		this.dough = "thick crust dough";
		this.sauce = "plum tomato sauce";
		this.toppings.add("grated Parmesan cheese");
	}
}

