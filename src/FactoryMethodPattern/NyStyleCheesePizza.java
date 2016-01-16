package FactoryMethodPattern;

public class NyStyleCheesePizza extends Pizza {

	public NyStyleCheesePizza() {
		this.name = "NyStyleCheesePizza";
		this.dough = "thin crust dough";
		this.sauce = "plum tomato sauce";
		this.toppings.add("grated Parmesan cheese");
	}
}
