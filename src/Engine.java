import java.io.Serializable;
public class Engine extends Shop implements Serializable {
    private static final long serialVersionUID = 1L;
    private int moveMultiplier;
/*Constructor*/
    public Engine()
    {
        
    }
/*Constructor*/    
    public Engine(String name, int price, int multiplier)
    {
        super(name,price);
        this.moveMultiplier=multiplier;
    }
/*To get the Name of the Engine*/
	public String getName()
	{
		return name;
	}
/*To get the Cost of the Engine*/		
	public int getCost()
	{
		return cost;
	}

/*To get the Multiplier of the Engine*/	        
        public int getMultiplier()
        {
                return this.moveMultiplier;
        }
}
