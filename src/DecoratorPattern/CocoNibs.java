package DecoratorPattern;

public class CocoNibs extends YoghurtToppings{
	
	public CocoNibs(FrozenYoghurt yoghurt) {
		super(yoghurt);
	}
	
	public String getDescription() {
		return yoghurt.getDescription() + " + CocoNibs";
	}

	@Override
	public Double getCost() {
		return yoghurt.getCost().doubleValue() + (0.70);
	}
}

