package AbstractFactory;

public class VeggiePizza extends Pizza {
	IngredientFactory factory;
	
	public VeggiePizza(IngredientFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public void prepare() {
		this.dough = factory.createDough();
		this.sauce = factory.createSauce();
		this.cheese = factory.createCheese();
		this.veggies = factory.createVeggies();
	}
}
