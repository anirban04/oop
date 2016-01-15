package DecoratorPattern;

public abstract class YoghurtToppings implements FrozenYoghurt{
	protected FrozenYoghurt yoghurt;
	
	public YoghurtToppings(FrozenYoghurt yoghurt) {
		this.yoghurt = yoghurt;
	}
	
	public abstract String getDescription();
	public abstract Double getCost();
}
