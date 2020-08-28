package strategydesignpattern;

/**
 * Describes a Goalie which is a type of Player on a Hockey team. 
 * @author Matt Duggan
 *
 */
public class Goalie extends Player{
	/**
	 * Parameterized constructor for the goalie class. Calls for the name of the goalie. 
	 * @param name
	 */
	  public Goalie(String name){
		    super(name);
		    setOffenceBehavior();
		    setDefenceBehavior();
	  }
	  /**
	   * Calls for goalies block goal behavior on offence.
	   */
	  public void setOffenceBehavior(){
		  offenceBehavior = new BlockGoalBehavior();
	  }
	 /**
	  * Calls for goalies block goal behavior on defence. 
	  */
	  public void setDefenceBehavior(){
		  defenceBehavior = new BlockGoalBehavior();
	  }
	  /**
	   * Displays the name and position as goalie. 
	   * @return A string with the name and position of the player. 
	   */
	  public String toString(){
	    return this.name + " plays the position: Goalie";
	  }
}
