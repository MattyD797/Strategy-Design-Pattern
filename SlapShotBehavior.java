package strategydesignpattern;

/**
 * Behavior of the player during a slap shot. 
 * @author Matt Duggan
 *
 */
public class SlapShotBehavior implements OffenceBehavior {
	/**
	 * Displays the behavior of the player. 
	 * @return A string of the behavior. 
	 */
	public String play(){
	      return "shoots the puck from the blue line";
	  }
}
