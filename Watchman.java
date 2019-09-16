/**
 *The Watchman gets its attributes and abilities from the interface Subject
 * @author Brian Guthrie
 */
import java.util.ArrayList;

public class Watchman implements Subject {
	ArrayList<Observer> observers;
	private int warning;
	
	/**
	 * Watchman uses an array to put the different observers and their sayings into it
	 */
	public Watchman() {
		observers = new ArrayList<Observer>();
	}
	
	/**
	 * this allows for each observer to be registered and to be able to call their abilities based on the warning
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * this allows for an observer to be removed from the array
	 */
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}	
	
	/**
	 * this notifies each observer of what type of warning is being called so they can output a specific string
	 */
	@Override
	public void notifyObservers() {
		if(warning == 1) {
			System.out.println("WARNING:  1 trumpet was played!");
		}
		if(warning == 2) {
			System.out.println("WARNING:  2 trumpets were played!");
		}
		for(Observer observer : observers) {
			observer.update(warning);
		}
	}
	
	/**
	 * gives the notifyObserver the ability to call a warning
	 * @param warning
	 */
	public void issueWarning(int warning) {
		this.warning = warning;
		notifyObservers();
	}

}