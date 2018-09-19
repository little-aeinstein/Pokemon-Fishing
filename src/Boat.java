import java.io.Serializable;
public class Boat extends Shop implements Serializable{
    	private int move;
        private int currentMove;
        private Engine engine, uselessEngine=new Engine("Useless Engine",0,1);
/*Constructor*/	
	public Boat(String name,int cost, int move){
            super(name,cost);
            this.move=move;
            this.currentMove=move;
            this.engine=uselessEngine;
	}        
/*To get the Name of the Boat*/
	public String getName()
	{
            return name;
	}
/*To get the Cost of the Boat*/		
	public int getCost()
	{
            return cost;
	}
/*To get the Moves of the Boat*/	
	public int getMove()
	{
            return this.move*this.engine.getMultiplier();
	}        
/*To get the current moves of the Boat*/
        public int getCurrentMove()
        {
            return this.currentMove;
        }
/*To Move*/
        public void useOneMove()
        {
            this.currentMove--;
        }
        
/*Resets current moves*/
        public void resetMoves()
        {
            this.currentMove=this.getMove();
        }
/*Resets Boat*/
        public void resetBoat()
        {
            this.engine=this.uselessEngine;
        }
/*To set Engine of the Boat*/        
        public void setEngine(Engine engine)
        {
            this.engine=engine;
        }
/*To get the Engine of the Boat*/
        public Engine getEngine()
        {
            return this.engine;
        }
}
