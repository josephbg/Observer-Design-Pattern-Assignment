/**
 * ShopOwner uses the Observer interface to update the warning based on the character
 * @author Brian Guthrie
 *
 */
public class ShopOwner implements Observer {
	Subject watchman;
	
	/**
	 * This class also uses the watchman class because a ShopOwner is a watchman and it allows for the type of warning
	 * @param watchman
	 */
	public ShopOwner(Subject watchman) {
		this.watchman = watchman;
		watchman.registerObserver(this);
	}
	
	/**
	 * When updating the warning the outputs are different for warning 1, and 2
	 */
	public void update(int warning) {
		if(warning == 1) {
			System.out.println("Shop Owner: Close down shop and head home");
		}
		if(warning == 2) {
			System.out.println("Shop Owner: Drops everything and find nearest hideout");
		}
	}
}