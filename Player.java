package strategydesignpattern;

/**
 * Parent class of Defenceman, Forward, and Goalie. Set common constructors across the respective children class. 
 * Controls setting new behaviors, turnovers and names. 
 * @author Matt Duggan
 *
 */
public abstract class Player {
	  /**
	   * Variables required to be considered a player. 
	   */
	  protected String name;
	  private boolean offense;
	  protected DefenceBehavior defenceBehavior;
	  protected OffenceBehavior offenceBehavior;
	  
	  /**
	   * Parameterized constructor for player. Sets game to offense first. 
	   * @param name String of user inputed player name from Hockey Driver.
	   */
	  public Player(String name){
	    this.name = name;
	    this.offense = true;
	  }
	  
	  /**
	   * Abstract method for requiring children to set defence behavior. 
	   */
	  public abstract void setDefenceBehavior();
	  
	  /**
	   * Abstract method for requiring children to set offence behavior. 
	   */
	  public abstract void setOffenceBehavior();
	  
	  /**
	   * Sets the type of behavior from each player in respect to whether the game is offence or defence. (eg  Defence behavior on defence 
	   * and vis versa. Checks for null pointer (no behavior) during play.
	   * @return A string or new object that will return a string that tells the behavior of the player. 
	   */
	  public String play(){
		  if( offenceBehavior == null || defenceBehavior ==null) {
			  throw new NullPointerException("offenceBehavior or defenceBehavior must be provided");
		  }
	      if(offense && offenceBehavior != null){
	        return offenceBehavior.play();
	      }
	      else if(!offense && defenceBehavior !=null){
	        return defenceBehavior.play();
	      }
	      else {
	    	  return "Players are not playing";
	      }
	   }
	  
	  /**
	   *Switches the game from offence to defence. 
	   */
	  public void turnover(){
	    this.offense = !this.offense;
	  }
}
