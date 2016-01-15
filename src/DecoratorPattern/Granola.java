package DecoratorPattern;

public class Granola extends YoghurtToppings{
	
	public Granola(FrozenYoghurt yoghurt) {
		super(yoghurt);
	}
	
	
	public String getDescription() {
		return yoghurt.getDescription() + " + granola";
	}

	@Override
	public Double getCost() {
		return yoghurt.getCost().doubleValue() + (0.50);
	}
}
