package AbstractFactory;

public class ChicagoPizzaIngredientFactory implements IngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Cheese createCheese() {
		return new MozzrellaCheese();
	
	}
	
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Clam createClams() {
		return new FrozenClams();
	}

	public Pepproni createPepproni() {
		return new SlicedPepproni();
	}

	public Veggies[] createVeggies() {
		Veggies[] veggies = {new Eggplant(), new Spinach(), new BlackOlives()};
		return veggies;
	}
}
