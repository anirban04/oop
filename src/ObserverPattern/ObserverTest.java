package ObserverPattern;

import java.util.Random;

public class ObserverTest {
	public static void main(String[] args) throws InterruptedException {
		StockPublisher pub = new StockPublisher();
		Observer obs = new StockSubscriber(pub);
		
		Random rand = new Random();
		Double price = 30.0;
		int count = 0;
		while (true) {
			Double update = rand.nextDouble();
			Thread.sleep(1000);
			pub.updatePrice(price);
			if (((Double)(update * 100.0)).intValue() % 2 > 0)
				price = price + rand.nextDouble();
			else
				price = price - rand.nextDouble();
			
			if (count++ == 10)
				pub.unregisterObserver(obs);
		}
	}
}
