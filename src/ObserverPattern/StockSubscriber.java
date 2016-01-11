package ObserverPattern;

public class StockSubscriber implements Observer {

	Subject stockPublisher;

	public StockSubscriber(Subject stockPublisher) {
		this.stockPublisher = stockPublisher;
		stockPublisher.registerObserver(this);
	}
	
	public void update(Double nvdaPrice) {
		System.out.println("nvdaPrice = " + nvdaPrice);
		
	}
}
