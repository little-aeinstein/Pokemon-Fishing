import java.io.Serializable;
public class Pokemon implements Serializable{
	private String name;
	private int fame;
	private double encounterRate;
	private double captureRate;
/*Constructor*/	
	public Pokemon(String name, int fame, double encounterRate, double captureRate)
	{	
			this.name = name;
			this.fame = fame;
			this.encounterRate = encounterRate;
			this.captureRate = captureRate;
	}
/*To get the Name of the Pokemon*/
	public String getName()
	{
		return this.name;
	}
/*To get the Encounter Rate of the Pokemon*/	
	public double getEncounterRate()
	{
		return this.encounterRate;
	}
/*To get the Capture Rate of the Pokemon*/	
	public double getCaptureRate()
	{
		return this.captureRate;
	}

/*To get the Fame of the Pokemon*/	
	public int getFame()
	{          
            return this.fame;
	}
/*To set the Fame of the Pokemon*/	
	public void setFame(int fame)
	{
		this.fame= this.fame-fame;
		if(this.fame<0)
			this.fame=0;
	}  
}