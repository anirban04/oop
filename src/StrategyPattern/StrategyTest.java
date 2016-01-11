package StrategyPattern;

public class StrategyTest {
	public static void main(String[] args) {	
		Duck d = new WoodenDuck();
		d.doFly();
		d.changeFlyFunc(new CanFly());
		d.doFly();
	}
	
}
