import java.io.Serializable;
public class TackleBox extends Shop implements Serializable {
    	private int cast;
        private int currentCast;        
/*Constructor*/	
	public TackleBox(String name,int cost, int cast)
	{
            super(name,cost);
            this.cast = cast;
            this.currentCast=cast;
	}
/*To get the Name of the Tackle Box*/
	public String getName()
	{
		return name;
	}
/*To get the Cost of the Tackle Box*/		
	public int getCost()
	{
		return cost;
	}
/*To get the Cast of the Tackle Box*/	
	public int getCast()
	{
            return this.cast;
	}	        
/*To get the current Cast of the Tackle Box*/
        public int getCurrentCast()
        {
            return this.currentCast;
        }
/*To reset current Cast*/
        public void resetCast()
        {
            this.currentCast=this.cast;
        }
/*Days Ends*/
        public void dayEnds()
        {
            this.currentCast=0;
        }
/*Use one cast*/
        public void useOneCast()
        {
            this.currentCast--;
        }
}
