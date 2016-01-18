package AbstractFactory;

public class NyPizzaIngredientFactory implements IngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	
	}
	
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Clam createClams() {
		return new FreshClams();
	}

	public Pepproni createPepproni() {
		return new SlicedPepproni();
	}

	public Veggies[] createVeggies() {
		Veggies[] veggies = {new Mushrooms(), new Onions(), new RedPeppers()};
		return veggies;
	}
}
