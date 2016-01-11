package ObserverPattern;
import java.util.*;

public class StockPublisher implements Subject {
	
	private Double nvdaPrice;
	List<Observer> Observers;

	public StockPublisher() {
		Observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer newObserver) {
		Observers.add(newObserver);
		System.out.println("Registering observer.");
	}

	public void unregisterObserver(Observer delObserver) {
		
		int idx = Observers.indexOf(delObserver);
		if (idx >= 0) {
			System.out.println("Unregistering observer.");
			Observers.remove(idx);
		}
	}

	public void notifyAllObservers() {
		for (Observer observer : Observers) {
			observer.update(nvdaPrice);
		}
	}
	
	public void updatePrice(Double nvdaPrice) {
		this.nvdaPrice = nvdaPrice;
		notifyAllObservers();
	}
}
