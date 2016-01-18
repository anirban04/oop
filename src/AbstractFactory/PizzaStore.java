package AbstractFactory;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		//Call the factory method that is responsible for creating the real pizza.
		Pizza pizza = createPizza(type); 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
}
