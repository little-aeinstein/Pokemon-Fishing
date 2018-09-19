import java.util.ArrayList;
import java.io.Serializable;
import java.util.Random;
public class Player implements Serializable {
	private String name;
	private String gender;
	private int money;
	private Map currentMap;
	private int x,y;
	private int day = 1;
	private ArrayList<FishingRod> rod = new ArrayList<FishingRod>();
	private ArrayList<TackleBox> box = new ArrayList<TackleBox>();
	private ArrayList<Boat> boat = new ArrayList<Boat>();
	private ArrayList<Integer> badge = new ArrayList<Integer>();
        private int mapGears;
  	private Random random = new Random();      
        /*Constructor*/
        public Player(FishingRod rod, TackleBox box, Boat boat)
        {
            for(int x=0;x<5;x++)
            {
                this.rod.add(rod);
                this.box.add(box);
                this.boat.add(boat);
                this.badge.add(0);
            }
        }
        /*Sets Badges*/
        public void setBadge()
        {
            this.badge.set(this.mapGears, 1);
        }
        /*Sets Rod*/
        public void setRod(FishingRod rod)
        {
            this.rod.set(mapGears, rod);
        }
        /*Sets Tackle Box*/
        public void setBox(TackleBox box)
        {
            this.box.set(mapGears, box);
        }
        /*Sets Boat*/
        public void setBoat(Boat boat)
        {
            this.boat.set(mapGears, boat);
        }
        /*Sets Lapras as Boat*/
        public void setLaprasCaptured(Boat boat)
        {
            for(int x=0;x<5;x++)
            {
                this.boat.set(x, boat);
            }
        }         
/*To set the Name and Gender of the Player*/	
	public void setNamexGender(String name, String gender)
	{
		this.name=name;
		this.gender=gender;
	}
 /*To get the Name of the Player*/       
        public String getName()
        {
            return this.name;
        }        
/*To get the gender of the Player*/
        public String getGender()
        {
            return this.gender;
        }
/*To set the Position of the Player*/	
	public void setXY(int x, int y)
	{
	  	this.x=x;
	  	this.y=y;
      	}        
/*To get the Y-Axis of the Player*/	
	public int getX()
	{
		return this.x;
	}
/*To get the X-Axis of the Player*/		
	public int getY()
	{
            
		return this.y;
	}
/*To set the current Map*/
        public void setCurrentMap(Map map)
        {
                this.currentMap=map;
                if(this.currentMap.getName().equals("Lake of Rage"))
                    mapGears=0;
                else if(this.currentMap.getName().equals("Route 119"))
                    mapGears=1;
                else if(this.currentMap.getName().equals("Union Cave"))
                    mapGears=2;
                else if(this.currentMap.getName().equals("Fiore's Sea"))
                    mapGears=3;
                else if(this.currentMap.getName().equals("Marine Cave"))
                    mapGears=4;                
        }
 /*To get the current Map*/
        public Map getCurrentMap()
        {
                return this.currentMap;
        }       
/*To set the Money of the Player*/	
	public void setMoney(int money)
	{
		this.money=this.money+money;
	}
	
	public int getDay()
	{
		return this.day;
	}
	
/*To set the Money of the Player*/	
	public void setBuyMoney(int money)
	{
		this.money=this.money-money;
	}
/*To get the Money of the Player*/		
	public int getMoney()
	{
		return this.money;
	}  
/*Checks if win*/       
        public int checkBadges()
        {
            int x=1;
            for(int y=0;y<badge.size();y++)
            {
                if(badge.get(y)==0)
                {
                    x=0;
                }
            }
            return x;
        }
/*Gets TackleBox*/        
        public TackleBox getTackleBox()
        {
            return this.box.get(mapGears);
        }

/*Gets FishingRod*/           
        public FishingRod getRod()
        {
            return this.rod.get(mapGears);
        }
/*Gets Boat*/  
        public Boat getBoat()
        {
            return this.boat.get(mapGears);
        }        
 /*Makes Player Move*/         
        public String move(String move)
        {
            char checker;
            int reply=1;
            if(move.equalsIgnoreCase("A"))
            {            
                if(this.y-1!=-1)
                {
                    checker=this.currentMap.tileFinder(x, y-1).getDepth();
                    if(checker=='U')
                    {
                        return "\n\n\nImpassable Terrain\n";
                    }
                    else if(checker=='P')
                    {	
                        this.setXY(this.getX(),this.getY()-1);									
                        this.getTackleBox().dayEnds();
                        return "Return to port";
                        
                    }
                    else
                    {
                    	this.setXY(this.getX(),this.getY()-1);
                    	this.getBoat().useOneMove();                  
                    	return "Move Successful";
                    }
                }
                else
                {
                    return "\n\n\nInvalid move, your trying to enter the World of One Piece\n";               
                }
            }
            else if(move.equalsIgnoreCase("D"))
            {
 		if(this.getY()+1!=11)
		{
                    checker=this.currentMap.tileFinder(x, y+1).getDepth();
                    if(checker=='U')
                    {
                        return "\n\n\nImpassable Terrain\n";
                    }
                    else if(checker=='P')
                    {	
                        this.setXY(this.getX(),this.getY()+1);									
                        this.getTackleBox().dayEnds();
                        return "Return to port";
                    }
                    else
                    {
                    	this.setXY(this.getX(),this.getY()+1);
                    	this.getBoat().useOneMove();    
                    	return "Move Successful";
                    }               
                }
                else
                {
                    return "\n\n\nInvalid move, your trying to enter the World of Narnia\n";                
                }                
            }
            else if(move.equalsIgnoreCase("W"))
            {
                if(this.getX()-1!=-1)
                {
                    checker=this.currentMap.tileFinder(this.getX()-1,this.getY()).getDepth();
                    if(checker=='U')
                    {
                        return "\n\n\nImpassable Terrain\n";
                    }
                    else if(checker=='P')
                    {
                        this.setXY(this.getX()-1,this.getY());									
                        this.getTackleBox().dayEnds();
                        return "Return to port";
                    }
                    else
                    {
                        this.setXY(this.getX()-1,this.getY());
                        this.getBoat().useOneMove(); 
                        return "Move Success";
                    }
                }
                else
                {
                    return "\n\n\nImpassable Terrain\n";
                }
            }           
           else if(move.equalsIgnoreCase("S"))
            {
                if(this.getX()+1!=11)
                {
                    checker=this.currentMap.tileFinder(this.getX()+1,this.getY()).getDepth();
                    if(checker=='U')
                    {
                        return"\n\n\nImpassable Terrain\n";
                    }
                    else if(checker=='P')
                    {
                        this.setXY(this.getX()+1,this.getY());									
                        this.getTackleBox().dayEnds();
                        return "Return to port";
                    }
                    else
                    {
                        this.setXY(this.getX()+1,this.getY());
                        this.getBoat().useOneMove(); 
                        return "Move successful";
                    }
                }
                else
                {
                    return "\n\n\nImpassable Terrain\n";
                }
            }
			return "hehehe";                       
        }
/*Makes Player*/          
    public String fish()
    {
        char checker=this.currentMap.tileFinder(this.getX(),this.getY()).getDepth();
        if(checker=='S'||checker=='D'||checker=='V')
        {
            int encounter=random.nextInt(100)+1;
            if(encounter<=this.currentMap.tileFinder(this.getX(), this.getY()).getPokemon().getEncounterRate()*100+this.getRod().getEncounterRate()*100)
            {
                int capture=random.nextInt(100)+1;
                if(capture<=this.currentMap.tileFinder(this.getX(), this.getY()).getPokemon().getCaptureRate()*100+this.getRod().getCaptureRate()*100)
                {
                    
                    this.currentMap.setFame(this.currentMap.tileFinder(this.getX(), this.getY()).getPokemon().getFame());
                    if(checker=='S')
                        this.currentMap.tileFinder(this.getX(), this.getY()).getPokemon().setFame(2);
                    else if(checker=='D')
                        this.currentMap.tileFinder(this.getX(), this.getY()).getPokemon().setFame(5);                        
                    else if(checker=='V')
                        this.currentMap.tileFinder(this.getX(), this.getY()).getPokemon().setFame(10);
                    
                    return "You have successfully captured wild "+this.currentMap.tileFinder(this.getX(), this.getY()).getPokemon().getName();
                }
                else
                {
                   return "You encountered the Pokemon but failed to capture it";
                }
            }
            else
            {
                return "You failed to encounter the Pokemon.";
            }			           
        }
        else if(checker=='L')
	{
            if(this.currentMap.getFame()==100&&this.currentMap.getnLegend()==1)
            {
                int capture=random.nextInt(100)+1;
                if(capture<=this.currentMap.tileFinder(this.getX(), this.getY()).getPokemon().getCaptureRate()*100+this.getRod().getCaptureRate()*100)
                {
                    this.setBadge();
                    this.currentMap.setnLegend();
                    return "You have successfully captured legendary pokemon "+this.currentMap.tileFinder(this.getX(), this.getY()).getPokemon().getName();
                }
                else
                {
                    return "You encountered the Pokemon but failed to capture it";
                }
            }
            else if(this.currentMap.getnLegend()==0)
            {
            	return "You cast the line but it seems that there are no longer any Pokemon living this tile.";
            }
            else
            {
            	return "Not enough fame to encounter the rare pokemon of this map.";
            }								
	}
        else if(checker=='T')
        {
            int encounter=random.nextInt(100)+1;

            if(encounter<=this.currentMap.tileFinder(this.getX(), this.getY()).getTreasure().getEncounterRate()*100+this.getRod().getEncounterRate()*100)
            {
                
                this.setMoney(this.currentMap.tileFinder(this.getX(), this.getY()).getTreasure().getPrice());
                return "You have retrieved the "+this.currentMap.tileFinder(this.getX(), this.getY()).getTreasure().getName();
            }
            else
            {
               return "You failed to find the treasure.";
            }				
        }
	else if(checker=='P')
	{
           return "You can't fish on the port.";
	}
		return "hehehe";        
         
    }
/*Day Passes*/      
    public void addDay()
    {
    	this.day++;
    }
	
}