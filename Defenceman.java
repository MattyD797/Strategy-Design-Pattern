package strategydesignpattern;

import java.util.Random;

/**
 * Child class of Player. Identifies the traits of a defenceman on a hockey team. 
 * @author Matt Duggan
 *
 */
public class Defenceman extends Player {
	/**
	 * Parameterized constructor to place a name for the defenceman.
	 */
	  public Defenceman(String name){
		    super(name);
		    setDefenceBehavior();
		    setOffenceBehavior();
	  }
	  
	  /**
	   * Randomly chooses between chasing the puck or blocking on defence. 
	   */
	  public void setDefenceBehavior(){
		  Random random = new Random();
		  DefenceBehavior[] chaseOrBlock = {new ChasePuckBehavior(), new BlockBehavior()};
		  int index = random.nextInt(chaseOrBlock.length);
		  defenceBehavior = chaseOrBlock[index];
	  }
	  
	  /**
	   * Will randomly 9/10 times choose to do a pass versus performing a slap shot at goal. 
	   */
	  public void setOffenceBehavior(){
		  Random random = new Random();
		  int x = random.nextInt(10);
		  if(x == 9) {
			  offenceBehavior = new SlapShotBehavior();
		  }
		  else {
			  offenceBehavior = new PassBehavior();
		  }
	  }
	  
	  /**
	   * States the players name and that he plays defence. 
	   * @return A string with name and then a title of position. 
	   */
	  public String toString(){
	    return this.name + " plays the position: Defenceman";
	  }
}
