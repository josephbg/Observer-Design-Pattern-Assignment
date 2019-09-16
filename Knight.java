/**
 * Knight uses the Observer interface to update the warning based on the character
 * @author Brian Guthrie
 *
 */
public class Knight implements Observer{
	Subject watchman;
	
	/**
	 * This class also uses the watchman class because a knight is a watchman and it allows for the type of warning
	 * @param watchman
	 */
	public Knight(Subject watchman) {
		this.watchman = watchman;
		watchman.registerObserver(this);
	}
	
	/**
	 * When updating the warning the outputs are different for warning 1, and 2
	 */
	public void update(int warning) {
		if(warning == 1) {
			System.out.println("Knight: Helps everyone get home safe");
		}
		if(warning == 2) {
			System.out.println("Knight: Prepares for battle");
		}
	}
}
