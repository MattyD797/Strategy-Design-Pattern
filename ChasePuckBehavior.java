package strategydesignpattern;

/**
 * Specifies the behavior for chasing a puck.
 * @author Matt Duggan
 *
 */
public class ChasePuckBehavior implements DefenceBehavior{
	/**
	 * Holds the type of chasing puck behavior.
	 * @return String of behavior.
	 */
	public String play(){
	      return "Chases the Puck";
	  }
}
