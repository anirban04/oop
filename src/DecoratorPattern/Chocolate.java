package DecoratorPattern;

public class Chocolate implements FrozenYoghurt{
	
	public String getDescription() {
		return "Chocolate Yoghurt";
	}

	public Double getCost() {
		return 3.00;
	}
	
}
