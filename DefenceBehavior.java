package strategydesignpattern;

/**
 * Interface of classes that are considered defence behaviors. 
 * @author Matt Duggan
 *
 */
public interface DefenceBehavior {
	/**
	 * Calls for a class to implement a a way to describe their behavior.
	 * @return String that describes behavior.
	 */
	public String play();
}
