package strategydesignpattern;

import java.util.Random;

/**
 * Child class of player that designates a forward for a hockey team. 
 * @author Matt Duggan
 *
 */
public class Forward extends Player {
	/**
	 * Parameterized constructors that requires the name fo the forward. 
	 * @param name
	 */
	  public Forward(String name){
		    super(name);
		    setDefenceBehavior();
		    setOffenceBehavior();
	  }
	  
	  /**
	   * Describes the behavior of the forward on defence: either chasing the puck or blocking.  
	   */
	  public void setDefenceBehavior(){
		  Random random = new Random();
		  DefenceBehavior[] chaseOrBlock = {new ChasePuckBehavior(), new BlockBehavior()};
		  int index = random.nextInt(chaseOrBlock.length);
		  defenceBehavior = chaseOrBlock[index];
	    
	  }
	  
	  /**
	   * Describes the offense behavior of the forward between passing or shooting. 
	   */
	  public void setOffenceBehavior(){
		  Random random = new Random();
		  OffenceBehavior[] passOrShoot = {new PassBehavior(), new ShootBehavior()};
		  int index = random.nextInt(passOrShoot.length);
		  offenceBehavior = passOrShoot[index];
	  }
	  
	  /**
	   * Displays the name and position as forward.
	   * @return String of name and position on team. 
	   */
	  public String toString(){
	    return this.name + " plays the position: Forward";
	  }
}
