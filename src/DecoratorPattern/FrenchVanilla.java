package DecoratorPattern;

public class FrenchVanilla implements FrozenYoghurt{
	
	public String getDescription() {
		return "French Vanilla Yoghurt";
	}

	public Double getCost() {
		return 3.00;
	}
	
}
