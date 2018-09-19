import java.io.Serializable;
/*This class contains properties and methods of the Treasures*/
public class Treasure implements Serializable
{
	private String name;
	private String maps;
	private int price;
	private double encounterR =0.25;
/*Constructor*/	
	public Treasure(String name,String maps, int price)
	{
		this.name = name;
		this.maps = maps;
		this.price = price;
	}
/*To Get the  Location of the Treasure */	
	public String getM()
	{
		return this.maps;
	}
/*To Get the Price of the Treasure*/	
	public int getPrice()
	{
		return this.price;
	}
/*To Get the Encounter Rate of the Treasure*/
	public double getEncounterRate()
	{
		return this.encounterR;
	}
/*To Get the Name of the Treasure*/	
	public String getName()
	{
		return this.name;
	}
}
