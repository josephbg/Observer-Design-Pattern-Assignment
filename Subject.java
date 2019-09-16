/**
 * The Subject interface gives the Watchman Class the ability to implement its abilities which also gives the characters
 * their abilities they get from being a watchman.
 * @author Brian Guthrie
 *
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
