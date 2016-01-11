package StrategyPattern;

public class WoodenDuck extends Duck {
	public WoodenDuck() {
		ff = new CantFly();
	}
}