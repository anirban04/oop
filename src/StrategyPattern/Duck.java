package StrategyPattern;

public class Duck {
	
	FlyFunction ff;
	
	public void doFly() {
		ff.fly();
	}
	
	public void changeFlyFunc(FlyFunction ff) {
		this.ff = ff;
	}
}
