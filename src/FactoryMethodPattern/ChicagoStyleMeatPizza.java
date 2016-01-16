package FactoryMethodPattern;

public class ChicagoStyleMeatPizza extends Pizza {
	
	public ChicagoStyleMeatPizza() {
		this.name = "ChicagoStyleCheesePizza";
		this.dough = "thick crust dough";
		this.sauce = "plum tomato sauce";
		this.toppings.add("extra meat and grated Parmesan cheese");
	}
}
