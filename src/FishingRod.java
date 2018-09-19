import java.io.Serializable;
/*This class contains properties and methods of the Rods*/
public class FishingRod extends Shop implements Serializable
{
	private double encounterR;
	private double captureR;
        private CustomizationRod lure,uselessLure = new CustomizationRod("Useless Lure",0,0,0,"Nothing");
        private CustomizationRod line,uselessLine = new CustomizationRod("Useless Line",0,0,0,"Nothing");
        private CustomizationRod reel,uselessReel = new CustomizationRod("Useless Reel",0,0,0,"Nothing");
        
/*Constructor*/	
	public FishingRod(String name,int p, double e, double cap)
	{
		super(name,p);
		this.encounterR = e;
		this.captureR = cap;
                this.lure=uselessLure;
                this.line=uselessLine;
                this.reel=uselessReel;                
	}
/*To get the Name of the Rod*/
	public String getName()
	{
		return name;
	}
/*To get the Cost of the Rod*/		
	public int getCost()
	{
		return cost;
	}
/*To get the Encounter Rate of the Rod*/		
	public double getEncounterRate()
	{
		return this.encounterR+this.line.getEncounterRate()+this.lure.getEncounterRate()+this.reel.getEncounterRate();
	}	
/*To get the Capture Rate of the Rod*/	
	public double getCaptureRate()
	{
		return this.captureR+this.line.getCaptureRate()+this.lure.getCaptureRate()+this.reel.getCaptureRate();
	}
/*To set the Lure of the Rod*/        
        public void setLure(CustomizationRod lure)
        {
            this.lure=lure;
        }

/*To get the Lure of the Rod*/          
        public CustomizationRod getLure()
        {
            return this.lure;
        }

/*To set the Line of the Rod*/          
        public void setLine(CustomizationRod line)
        {
            this.line=line;
        }

/*To get the Line of the Rod*/  
        public CustomizationRod getLine()
        {
            return this.line;
        } 

/*To set the Reel of the Rod*/          
        public void setReel(CustomizationRod reel)
        {
            this.reel=reel;
        }	

        
/*To get the Reel of the Rod*/  
        public CustomizationRod getReel()
        {
            return this.reel;
        }

/*To reset the Rod*/          
        public void resetRod()
        {
            this.lure=uselessLure;
            this.line=uselessLine;
            this.reel=uselessReel;           
        }
}
