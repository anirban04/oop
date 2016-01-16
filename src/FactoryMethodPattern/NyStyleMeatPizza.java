package FactoryMethodPattern;

public class NyStyleMeatPizza extends Pizza {
	
	public NyStyleMeatPizza() {
		this.name = "NyStyleMeatPizza";
		this.dough = "thin crust dough";
		this.sauce = "marinara sauce";
		this.toppings.add("extra meat");
	}
}

