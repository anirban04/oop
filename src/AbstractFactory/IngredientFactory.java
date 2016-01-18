package AbstractFactory;

public interface IngredientFactory {
	public abstract Dough createDough();
	public abstract Cheese createCheese();
	public abstract Sauce createSauce();
	public abstract Clam createClams();
	public abstract Pepproni createPepproni();
	public abstract Veggies[] createVeggies();
}
