/**
 * Teacher uses the Observer interface to update the warning based on the character
 * @author Brian Guthrie
 *
 */
public class Teacher implements Observer{
	Subject watchman;
	
	/**
	 * This class also uses the watchman class because a Teacher is a watchman and it allows for the type of warning
	 * @param watchman
	 */
	public Teacher(Subject watchman) {
		this.watchman = watchman;
		watchman.registerObserver(this);
	}
	
	/**
	 * When updating the warning the outputs are different for warning 1, and 2
	 */
	public void update(int warning) {
		if(warning == 1) {
			System.out.println("Teacher: Helps get every kid home safe");
		}
		if(warning == 2) {
			System.out.println("Teacher: Brings all students to the underground shelter");
		}
	}
}