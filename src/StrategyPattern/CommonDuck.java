package StrategyPattern;

public class CommonDuck extends Duck {
	public CommonDuck() {
		ff = new CanFly();
	}
}
