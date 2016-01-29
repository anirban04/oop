package Singleton;

public class SingletonTest {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				Singleton.getInstance();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				Singleton.getInstance();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

}
