package FactoryMethodPattern;

public abstract class IngredientFactory {
	public abstract Cheese createDough();
	public abstract Dough createCheese();
	public abstract Sauce createSauce();
}
