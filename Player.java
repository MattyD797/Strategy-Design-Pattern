//Written By Matt Duggan
//CSCE247

public abstract class Player {

  //Variables of every player on the ice/court.
  protected String name;
  private boolean offense;
  protected DefenceBehavior defenceBehavior;
  protected OffenceBehavior offenceBehavior;

  public Player(String name){
    this.name = name;
  }

  public void setDefenceBehavior(){
    defenceBehavior.setDefenceBehavior();
  }

  public void setOffenceBehavior(){
    offenceBehavior.setOffenceBehavior();
  }

  public String play(){

  }

  public void turnover(){
    
  }
}
