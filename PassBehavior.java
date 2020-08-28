/**
 * 
 */
package strategydesignpattern;

/**
 * Offense behavior that displays the player passing. 
 * @author Matt Duggan
 *
 */
public class PassBehavior implements OffenceBehavior{
	/**
	 * Describes the players action during play. 
	 * @return A string displaying the pass behavior. 
	 */
	public String play(){
	      return "passes to a forward";
	  }
}
