/*This class contains properties and methods of the Maps*/
import java.io.Serializable;
public class Map implements Serializable {
	private String name;
	private Tile[][] tile;
	private int nLegend=1;
	private int fame=0;
        private TilePort P;
        private CustomizationRod lure,uselessLure = new CustomizationRod("Useless Lure",0,0,0,"Nothing");
        private CustomizationRod line,uselessLine = new CustomizationRod("Useless Line",0,0,0,"Nothing");
        private CustomizationRod reel,uselessReel = new CustomizationRod("Useless Reel",0,0,0,"Nothing");
        private Engine engine, uselessEngine=new Engine("Useless Engine",0,1);
        
	/*Constructor*/	

	public Map(String name,TilePort P, TileP S, TileP D, TileP V, TileP L, TileT T, TileU U)
	{
                this.lure=uselessLure;
                this.line=uselessLine;
                this.reel=uselessReel; 
                this.engine=uselessEngine;
                this.P=P;
		this.name=name;
		if(name.equals("Lake of Rage"))
		{	
                    tile= new Tile[][]
                    {
                        {U,U,U,U,U,U,U,U,U,U,U},
			{U,U,U,V,V,V,V,V,V,U,U},
			{U,U,V,V,D,D,D,D,D,U,U},
			{U,U,V,D,S,S,T,S,D,V,U},
			{U,V,D,D,S,S,S,S,D,V,U},
			{U,V,S,S,S,P,S,D,D,V,U},
			{U,V,D,D,S,S,S,D,D,V,U},
			{U,V,D,D,D,S,D,D,D,V,U},
			{U,V,V,D,D,D,D,D,V,V,U},
			{U,U,U,V,V,V,V,V,L,U,U},
			{U,U,U,U,U,U,U,U,U,U,U},
                    };								
		}
		else if(name.equals("Union Cave"))
		{
                    tile= new Tile[][]
                    {
                        {U,U,U,U,U,L,U,U,U,U,U},
                        {U,U,V,V,V,V,V,V,V,U,U},
                        {U,V,V,V,V,V,V,V,V,V,U},
                        {U,V,D,D,D,D,D,D,D,V,U},
                        {U,D,D,D,D,D,D,T,D,D,U},
                        {U,D,D,D,D,D,D,D,D,D,U},
                        {U,D,S,S,S,S,S,S,S,D,U},
                        {U,D,S,T,S,S,S,S,S,D,U},
                        {U,S,S,S,S,S,S,S,S,S,U},
                        {U,U,S,S,S,S,S,S,S,U,U},
                        {U,U,U,U,U,P,U,U,U,U,U}
                    };			
		}                
		else if(name.equals("Route 119"))
		{
                    tile= new Tile[][]
                    {
                        {P,S,S,S,S,D,D,U,U,U,U},
			{U,S,S,S,S,D,T,U,U,U,U},
			{U,S,S,S,S,D,D,U,U,U,U},
			{U,S,S,S,L,D,D,U,U,U,U},
			{U,D,D,D,D,D,D,U,U,U,U},
			{U,D,D,D,D,D,D,U,U,U,U},
			{U,D,V,T,V,V,V,U,U,U,U},
			{U,U,U,V,V,V,V,V,V,U,U},
			{U,U,U,U,V,V,V,V,V,U,U},
			{U,U,U,U,V,V,V,V,V,V,U},
			{U,U,U,U,V,V,V,V,V,V,U},
                    };				
		}
		else if(name.equals("Fiore's Sea"))
		{
                    tile= new Tile[][]
                    {
                        {V,V,V,V,V,V,V,V,V,V,L},
                        {V,V,V,V,V,V,S,U,S,V,V},
                        {D,D,D,D,D,S,U,U,U,S,V},
                        {S,S,U,S,S,D,S,U,S,D,V},
                        {S,U,U,U,S,D,D,D,D,D,V},
                        {D,D,U,D,D,D,T,D,D,D,V},
                        {T,D,D,D,D,D,D,D,D,D,V},
                        {S,S,S,S,S,D,D,D,D,D,V},
                        {S,S,S,S,S,D,D,D,D,D,V},
                        {S,S,S,S,S,D,D,D,D,D,V},
                        {P,S,S,S,S,D,D,D,D,D,V}
                    };
		}
		else if(name.equals("Marine Cave"))
		{
                    tile= new Tile[][]
                    {
                        {U,V,V,D,V,L,V,V,V,V,U},
                        {U,V,D,S,D,V,V,V,V,V,U},
                        {U,D,S,U,S,D,D,D,D,D,U},
                        {U,S,U,U,U,S,D,D,D,D,U},
                        {U,D,S,U,S,D,D,S,D,D,U},
                        {U,D,D,S,D,D,S,U,T,D,U},
                        {U,D,D,D,D,S,U,U,U,S,U},
                        {U,D,D,T,S,S,S,U,S,D,U},
                        {U,D,D,S,S,S,S,S,D,D,U},
                        {U,D,D,S,S,S,S,S,D,D,U},
                        {U,D,D,S,S,P,S,S,D,D,U}
                    };			
		}
	}
/*To Display the Map*/	
	public void displayMap(int xP,int yP)
	{
		for(int x=0;x<11;x++)
		{	
			System.out.print("| ");
			for(int y=0;y<11;y++)
			{
				if(x!=xP||y!=yP)
				System.out.print(tile[x][y].getDepth()+" | ");	
				else
				System.out.print("X | ");
			}
			System.out.println("");
		}
	}        
        
/*To get the Y-Axis of the port in the Map*/		
	public int getPortX()
	{
		int x;
		int y;
		int found=0;
		for(x=0;x<11&&found==0;)
		{
			for(y=0;y<11&&found==0;)
			{
				if(this.tile[x][y]==P)
					found=1;
				else 
					y++;
			}
			if(y==11)
				y=10;			
			if(this.tile[x][y]!=P)
				x++;
		}
		return x;
	}
/*To get the X-Axis of the Port in the Map*/		
	public int getPortY()
	{
		int x;
		int y=0;
		int found=0;
		for(x=0;x<11&&found==0;)
		{
			for(y=0;y<11&&found==0;)
			{
				if(this.tile[x][y]==P)
					found=1;
				else 
					y++;
			}
			x++;
		}
		return y;
	}        
/*To set the Fame of the Player*/	
	public void setFame(int fame)
	{
		this.fame=this.fame+fame;
		if(this.fame>100)
			this.fame=100;
	}
/*To get the Fame of the Player*/		
	public int getFame()
	{
		return this.fame;
	}       
        
	public Tile tileFinder(int x, int y)
	{
		return tile[x][y];
	}        
/*To set the # of Rare Pokemons in the Map*/		
	public void setnLegend()
	{
		nLegend=0;
	}		
	public void setnLegend(int x)
	{
		this.nLegend=x;
	}
/*To get the # of Rare Pokemons in the Map*/			
	public int getnLegend()
	{
		return this.nLegend;
	}        
/*To get the name of the Map*/
        public String getName()
        {
            return this.name;
        }
/*Stores the customization after leaving the map*/        
        public void setCustomization(CustomizationRod lure,CustomizationRod line, CustomizationRod reel,Engine engine)
        {
            this.lure=lure;
            this.line=line;
            this.reel=reel;
            this.engine=engine;
        }
        
        public CustomizationRod getLure()
        {
            return this.lure;
        }
        public CustomizationRod getLine()
        {
            return this.line;
        }        
        public CustomizationRod getReel()
        {
            return this.reel;
        }
        public Engine getEngine()
        {
            return this.engine;
        }


}