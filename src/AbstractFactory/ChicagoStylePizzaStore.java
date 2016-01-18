package AbstractFactory;

public class ChicagoStylePizzaStore extends PizzaStore {
	
	protected Pizza createPizza(String type) {
		
		Pizza pizza;
		IngredientFactory factory = new ChicagoPizzaIngredientFactory();
		
		if (type.equals("Cheese")) {
			pizza =  new CheesePizza(factory);
			pizza.setName(" Chicago Style Cheese Pizza");
		}
		else if (type.equals("Veggie")) {
			pizza = new VeggiePizza(factory);
			pizza.setName(" Chicago Style Veggie Pizza");
		}
		else if (type.equals("Clam")) {
			pizza = new ClamPizza(factory);
			pizza.setName(" Chicago Style Clam Pizza");
		}
		else if (type.equals("Pepproni")) {
			pizza = new PepproniPizza(factory);
			pizza.setName(" Chicago Style Pepproni Pizza");
		}
		else
			return null;
		
		return pizza;
	}
}
