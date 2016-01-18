package AbstractFactory;

public abstract class Pizza {
	
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Clam clam;
	Pepproni pepproni;
	Veggies [] veggies;

	public abstract void prepare();
	
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
