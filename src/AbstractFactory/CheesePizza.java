package AbstractFactory;

public class CheesePizza extends Pizza {
	IngredientFactory factory;
	
	public CheesePizza(IngredientFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public void prepare() {
		this.dough = factory.createDough();
		this.sauce = factory.createSauce();
		this.cheese = factory.createCheese();
	}
}

