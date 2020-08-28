package strategydesignpattern;

/**
 * Describes the behavior of a player when shooting. . 
 * @author Matt Duggan
 *
 */
public class ShootBehavior implements OffenceBehavior{
	/**
	 * Calls for behavior. 
	 * @return A string of the player shooting at the goal. 
	 */
	public String play(){
	      return "shoots at the goal";
	  }
}
