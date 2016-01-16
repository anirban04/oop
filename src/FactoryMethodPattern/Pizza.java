package FactoryMethodPattern;
import java.util.*;

public abstract class Pizza {
	
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Using " + dough);
		System.out.println("Using " + sauce);
		for (String topping : toppings)
			System.out.println("Adding " + topping);
	}
	
	public void bake() {
		System.out.println("baking " + name);
	}
	
	public void cut() {
		System.out.println("Cutting " + name);
	}
	
	public void box() {
		System.out.println("boxing " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
