package ObserverPattern;

public interface Subject {
	
	public void registerObserver(Observer newObserver);
	public void unregisterObserver(Observer delObserver);
	public void notifyAllObservers();
}
