public class Goalie extends Player {
  public Goalie(String name){
    super(name);
    defenceBehavior = offenceBehavior = new BlockGoalBehavior();
  }
  public void toString(){
    
  }
}
