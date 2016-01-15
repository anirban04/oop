package DecoratorPattern;

public class ShavedMilkChocolate extends YoghurtToppings{
	
	public ShavedMilkChocolate(FrozenYoghurt yoghurt) {
		super(yoghurt);
	}
	
	public String getDescription() {
		return yoghurt.getDescription() + " + ShavedMilkChocolate";
	}

	@Override
	public Double getCost() {
		return yoghurt.getCost().doubleValue() + (0.50);
	}
}
