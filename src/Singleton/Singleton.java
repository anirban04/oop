package Singleton;

public class Singleton {
	
	private static Singleton uniqueInstance = null;
	
	private Singleton() {
		System.out.println("Creating Singleton object!");
	}
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized(Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
