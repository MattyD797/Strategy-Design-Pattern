package strategydesignpattern;

/**
 * Interface requiring all offence behaviors to describe their behavior. 
 * @author Matt Duggan
 *
 */
public interface OffenceBehavior {
	/**
	 * Describes the play of the player. 
	 * @return A string with the behavior of the player. 
	 */
	public String play();
}
