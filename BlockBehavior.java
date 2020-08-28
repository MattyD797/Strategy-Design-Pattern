package strategydesignpattern;

import java.util.Random;

/**
 * The collection of blocking behaviors a child class of player can call. 
 * @author Matt Duggan
 *
 */
public class BlockBehavior implements DefenceBehavior{
	/**
	 * Picks between an array of behaviors randomly. 
	 * @return String of players blocking behavior.
	 */
	public String play(){
	    Random random = new Random();  
	    String[] blocks = {"blocks player from passing", "blocks player from shooting", "checks player with puck"};
	    int index = random.nextInt(blocks.length);
		return blocks[index];
	  }
}
