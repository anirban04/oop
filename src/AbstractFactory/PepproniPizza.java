package AbstractFactory;

public class PepproniPizza extends Pizza {
	IngredientFactory factory;
	
	public PepproniPizza(IngredientFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public void prepare() {
		this.dough = factory.createDough();
		this.sauce = factory.createSauce();
		this.cheese = factory.createCheese();
		this.pepproni = factory.createPepproni();
	}
}

