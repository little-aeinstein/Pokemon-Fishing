import java.io.Serializable;
public class CustomizationRod extends Shop implements Serializable{
    private static final long serialVersionUID = 1L;
    private String type;
    private double encounterR;
    private double captureR;   
/*Constructor*/
    public CustomizationRod()
    {
        
    }
/*Constructor*/    
    public CustomizationRod(String name, int price, double encounter, double capture, String type)
    {
        super(name,price);
        this.encounterR=encounter;
        this.captureR=capture;
        this.type=type;
    }
/*To get the Name of the Customization for the Rod*/
	public String getName()
	{
		return name;
	}
/*To get the Cost of the Customization for the Rod*/		
	public int getCost()
	{
		return cost;
	}    
 /*To get the Encounter Rate of the Customization for the Rod*/		
	public double getEncounterRate()
	{
		return this.encounterR;
	}	
/*To get the Capture Rate of the Customization for the Rod*/	
	public double getCaptureRate()
	{
		return this.captureR;
	}
/*To get the type of the Customization for the Rod*/        
        public String getType()
        {
                return this.type;
        }
}
