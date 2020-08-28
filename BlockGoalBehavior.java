package strategydesignpattern;

import java.util.Random;

/**
 * A collection of goal blocking behaviors a child of a player can call. 
 * @author Matt Duggan
 *
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior{
	/**
	 * Randomly chooses action to block a goal within an array.
	 * @return A string of designating the players action. 
	 */
	public String play(){
		Random random = new Random();  
	    String[] blockGoal = {"hand blocks the puck", "catches the puck", "blocks puck with knee pads", "blocks puck with stick"};
	    int index = random.nextInt(blockGoal.length);
		return blockGoal[index];
	  }
}
