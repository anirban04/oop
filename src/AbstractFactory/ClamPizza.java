package AbstractFactory;

public class ClamPizza extends Pizza {
	IngredientFactory factory;
	
	public ClamPizza(IngredientFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public void prepare() {
		this.dough = factory.createDough();
		this.sauce = factory.createSauce();
		this.cheese = factory.createCheese();
		this.clam = factory.createClams();
	}
}

