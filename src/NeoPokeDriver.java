/*Main Class Which Will Run the Whole Game*/
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class NeoPokeDriver
{
	public static void main (String []args)
	{
	//----------------------------------------------Declare--------------------------------------------------------
		Scanner scanner = new Scanner(System.in);
		
		FishingRod oldRod = new FishingRod ("Old Rod",0,0,0);
		FishingRod goodRod = new FishingRod ("Good Rod",3000,0.1,0.05);
		FishingRod superRod = new FishingRod ("Super Rod",8000,0.15,0.2);
		FishingRod masterRod = new FishingRod ("Master Rod",20000,0.2,0.4);
		
		TackleBox basicBox = new TackleBox ("Basic Box",0,5);
		TackleBox goodBox = new TackleBox ("Good Box",1500,8);
		TackleBox superBox = new TackleBox ("Super Box",2000,10);
		TackleBox masterBox = new TackleBox ("Master Box",2500,15);
		
		Treasure pearl = new Treasure ("Pearl","Lake of Rage",1000);
		Treasure starDust = new Treasure ("Star Dust","Union Cave",2500);
		Treasure bigPearl = new Treasure ("Big Pearl","Route 119",3000);
		Treasure nugget = new Treasure ("Nugget","Fiore's Sea",4500);
		Treasure bigNugget = new Treasure ("Big Nugget","Marine Cave",10000);
                
		Pokemon magikarp = new Pokemon("Magikarp",10,.5,.4);
		Pokemon tentacool = new Pokemon("Tentacool",20,.25,.2);
		Pokemon staryu = new Pokemon("Staryu",30,.15,.1);
		Pokemon redGyarados = new Pokemon("Red Gyarados",0,1,.1);
                
                Pokemon goldeen = new Pokemon("Goldeen",10,.5,.4);
		Pokemon horsea = new Pokemon("Horsea",20,.25,.2);
		Pokemon shelder = new Pokemon("Shelder",30,0.15,0.1);
		Pokemon laprasP = new Pokemon("Lapras",0,1,.1);                
                
                Pokemon remoraid = new Pokemon("Remoraid",10,.5,.4);
		Pokemon quilfish = new Pokemon("Quilfish",20,.25,.2);
		Pokemon carvanha = new Pokemon("Carvanha",30,0.15,0.1);  
		Pokemon feebas = new Pokemon("Feebas",0,1,.1); 
                
                Pokemon frillish = new Pokemon("Frillish",10,.5,.4);
		Pokemon finneon = new Pokemon("Finneon",20,.25,.2);
		Pokemon alomomora = new Pokemon("Alomomora",30,0.15,0.1);
 		Pokemon manaphy = new Pokemon("Manaphy",0,1,.1);                

                Pokemon chinchou = new Pokemon("Chinchou",10,.5,.4);
		Pokemon wailmer = new Pokemon("Wailmer",20,.25,.2);
		Pokemon relicanth = new Pokemon("Relicanth",30,0.15,0.1);
 		Pokemon kyogre = new Pokemon("Kyogre",0,1,.1);  
                
		TilePort tileP = new TilePort('P');
		TileP tileLS = new TileP('S',magikarp);
		TileP tileLD = new TileP('D',tentacool);
		TileP tileLV = new TileP('V',staryu);
		TileP tileLL = new TileP('L',redGyarados);
		TileT tileLT = new TileT('T',pearl);
		TileU tileU = new TileU('U');                

		TileP tileUS = new TileP('S',goldeen);
		TileP tileUD = new TileP('D',horsea);
		TileP tileUV = new TileP('V',shelder);
		TileP tileUL = new TileP('L',laprasP);
		TileT tileUT = new TileT('T',starDust);
                
		TileP tileRS = new TileP('S',remoraid);
		TileP tileRD = new TileP('D',quilfish);
		TileP tileRV = new TileP('V',carvanha);
		TileP tileRL = new TileP('L',feebas);
		TileT tileRT = new TileT('T',bigPearl);
                
		TileP tileFS = new TileP('S',frillish);
		TileP tileFD = new TileP('D',finneon);
		TileP tileFV = new TileP('V',alomomora);
		TileP tileFL = new TileP('L',manaphy);
		TileT tileFT = new TileT('T',nugget);    
               
		TileP tileMS = new TileP('S',chinchou);
		TileP tileMD = new TileP('D',wailmer);
		TileP tileMV = new TileP('V',relicanth);
		TileP tileML = new TileP('L',kyogre);
		TileT tileMT = new TileT('T',bigNugget);                    
 
                
		Map lakeOfRage = new Map("Lake of Rage",tileP,tileLS,tileLD,tileLV,tileLL,tileLT,tileU);
                Map unionCave = new Map("Union Cave",tileP,tileUS,tileUD,tileUV,tileUL,tileUT,tileU);
		Map route119 = new Map("Route 119",tileP,tileRS,tileRD,tileRV,tileRL,tileRT,tileU);
		Map fioreSea = new Map("Fiore's Sea",tileP,tileFS,tileFD,tileFV,tileFL,tileFT,tileU);
		Map marineCave = new Map("Marine Cave",tileP,tileMS,tileMD,tileMV,tileML,tileMT,tileU);
		
		Boat rowBoat = new Boat("Row Boat",0,5);
		Boat speedBoat = new Boat("Speed Boat",3500,10);
		Boat sharpedoBoat = new Boat("Sharpedo Boat",5000,15);
		Boat lapras = new Boat("Lapras",0,25);
                
		Player player = new Player(oldRod,basicBox,rowBoat);		

		Map chosenMap=lakeOfRage;	

                
                ArrayList<Pokemon> pokeList = new ArrayList<Pokemon>();
                pokeList.add(magikarp);
                pokeList.add(tentacool);
                pokeList.add(staryu);
                pokeList.add(redGyarados);
                
                pokeList.add(goldeen);
                pokeList.add(horsea);
                pokeList.add(shelder);
                pokeList.add(laprasP);
                
                pokeList.add(remoraid);
                pokeList.add(quilfish);
                pokeList.add(carvanha);
                pokeList.add(feebas);
                
                pokeList.add(frillish);
                pokeList.add(finneon);
                pokeList.add(alomomora);
                pokeList.add(manaphy);
                
                pokeList.add(chinchou);
                pokeList.add(wailmer);
                pokeList.add(relicanth);
                pokeList.add(kyogre);
                
		ArrayList<Shop> shop = new ArrayList<Shop>();
                ArrayList<FishingRod> rod = new ArrayList<FishingRod>();
                ArrayList<TackleBox> box = new ArrayList<TackleBox>();
                ArrayList<Boat> boat = new ArrayList<Boat>();
                shop.add(lapras);
		shop.add(goodRod);
                shop.add(superRod);
                shop.add(masterRod);
                shop.add(goodBox);
                shop.add(superBox);
                shop.add(masterBox);
                shop.add(speedBoat);
                shop.add(sharpedoBoat);
                rod.add(oldRod);
                rod.add(goodRod);
                rod.add(superRod);
                rod.add(masterRod);
                box.add(basicBox);
                box.add(goodBox);
                box.add(superBox);
                box.add(masterBox);
                boat.add(rowBoat);
                boat.add(speedBoat);
                boat.add(sharpedoBoat);
                boat.add(lapras);  
                
                CustomizationRod greatLure = new CustomizationRod("Great Lure",500,.05,.05,"Lure");
                CustomizationRod ultraLure = new CustomizationRod("Ultra Lure",700,.1,.05,"Lure");
                CustomizationRod masterLure = new CustomizationRod("Master Lure",900,.3,.07,"Lure"); 
           
                CustomizationRod greatLine = new CustomizationRod("Great Line",700,0,.1,"Line");
                CustomizationRod ultraLine = new CustomizationRod("Ultra Line",800,0,.15,"Line");
                CustomizationRod masterLine = new CustomizationRod("Master Line",900,.0,.25,"Line");
                
                CustomizationRod greatReel = new CustomizationRod("Great Reel",800,.1,.1,"Reel");
                CustomizationRod ultraReel = new CustomizationRod("Ultra Reel",950,.18,.18,"Reel");
                CustomizationRod masterReel = new CustomizationRod("Master Reel",1000,.21,.21,"Reel");
                
                ArrayList<CustomizationRod> customRod = new ArrayList<CustomizationRod>();
                customRod.add(new CustomizationRod("",0,0,0,""));
                customRod.add(greatLure);
                customRod.add(ultraLure);
                customRod.add(masterLure); 
                
                customRod.add(greatLine);
                customRod.add(ultraLine);
                customRod.add(masterLine);  
                
                customRod.add(greatReel);
                customRod.add(ultraReel);
                customRod.add(masterReel);
                
                Engine aquaEngine = new Engine("Team Aqua's Engine",1000,2);
		//---------------------------------------------------------------------------------------------------------------;
                int limit = 30;
                int victory=0;
                int days=0;
                int exit=0;		


                System.out.println("Do you have an existing file:?(y/n)");		
                for(String rep7=("error");rep7.equalsIgnoreCase("error");)
                {
                    rep7 = scanner.next();
                    if(rep7.equalsIgnoreCase("n"))
                    {
                        System.out.print("Are you a boy or are you a girl?(B/G)");
                        String rep = scanner.next();
                        System.out.print("Enter your name:");
                        String rep2 = scanner.next();
                        player.setNamexGender(rep2,rep);
                    }
                    else if(rep7.equalsIgnoreCase("y"))
                    {
                        System.out.println("Enter your name (case sensitive):");
                        String name = scanner.next();
                        try{
                            FileInputStream file = new FileInputStream(name+".sav");
                            ObjectInputStream load = new ObjectInputStream(file);
                            days=(Integer)load.readObject();
                            lakeOfRage=(Map)load.readObject();
                            unionCave=(Map)load.readObject();
                            route119=(Map)load.readObject();
                            fioreSea=(Map)load.readObject();
                            marineCave=(Map)load.readObject();
                            player=(Player) load.readObject();
                            for(int x=0;x<pokeList.size();x++)
                            {
                                pokeList.set(x,(Pokemon)load.readObject());
                            }
                            load.close();
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                            rep7=("error");
                            System.out.println("Account not found, Do you really have an account? (y/n)");                            
                        }
                    }
                    else
                    {
                        rep7=("error");
                        System.out.println("Not in Choices, only (y/n)");
                    }
                }   
                
                
                for(;victory!=1&&days<limit;)
                {
                    for(int accept=0;accept==0;)
                    {
                        accept=1;
                        System.out.println("The following are available maps to explore (Only input the #):");
                        System.out.println("1-Lake of Rage");
                        System.out.println("2-Union Cave");
                        if(lakeOfRage.getnLegend()==0)System.out.println("3-Route 119");
                        if(unionCave.getnLegend()==0)System.out.println("4-Fiore's Sea");
                        if(lakeOfRage.getnLegend()==0)System.out.println("5-Marine Cave");
                        System.out.print("Enter the map you wish to fish:");
                        int rep3 = scanner.nextInt();
                        if(rep3==1)
                            chosenMap = lakeOfRage;
                        else if(rep3==2)
                            chosenMap = unionCave;
                        else if(rep3==3&&lakeOfRage.getnLegend()==0)
                            chosenMap = route119;
                        else if(rep3==4&&unionCave.getnLegend()==0)
                            chosenMap = fioreSea;
                        else if(rep3==5&&lakeOfRage.getnLegend()==0)
                            chosenMap = marineCave;                        
                        else
                            accept=0;
                    }
                    player.setCurrentMap(chosenMap);
                    player.setXY(player.getCurrentMap().getPortX(),player.getCurrentMap().getPortY());
                    player.getRod().setLine(chosenMap.getLine());
                    player.getRod().setLure(chosenMap.getLure());
                    player.getRod().setReel(chosenMap.getReel());
                    if(player.getBoat()!=lapras)player.getBoat().setEngine(chosenMap.getEngine());
                    
                    for(exit=0;days<limit&&exit==0;days++)
                    {				
                        if(player.checkBadges()==0&&chosenMap.getnLegend()==1)
			{      
                            System.out.println("Day "+(days+1)+" starts.");
                            player.getBoat().resetMoves();
                            player.getTackleBox().resetCast();  
                            
                            
                            for(;player.getBoat().getCurrentMove()!=-1&&player.getTackleBox().getCurrentCast()!=0;)
                            { 

                                    System.out.println("X - Current Position, P - Port, S - Shallow Water, D - Deep Water, V - Very Deep Water, L - Legendary Tile, T - Treasure Tile, U - Land (Impassable terrain).");
                                    chosenMap.displayMap(player.getX(),player.getY());
                                    System.out.println("You still have:\nMoves:"+player.getBoat().getCurrentMove()+"\nCasts:"+player.getTackleBox().getCurrentCast()+"\nCurrent fame in this map:"+chosenMap.getFame());
                                    System.out.print("Enter a command(A-left/S-down/D-right/W-up/F-fish):");
                                    String move = scanner.next();
                                    if(move.equalsIgnoreCase("A")||move.equalsIgnoreCase("D")||move.equalsIgnoreCase("S")||move.equalsIgnoreCase("W"))
                                    {
                                        player.move(move);
                                    }
                                    
                                    else if(move.equalsIgnoreCase("F"))
                                    {
                                        player.fish();
                                    }
                                    
                                    else 
                                    {
                                    	System.out.println("Invalid command, please try again.");
                                    }                                    

                            }
                            
                            
                            
                            
                            
                            //HEHEHEHE
                            player.setXY(player.getCurrentMap().getPortX(),player.getCurrentMap().getPortY());
                            System.out.println("Welcome to the Shop");
                            for(int leave=0;leave==0;)
                            {
                                System.out.println( "Your current money is "+player.getMoney()+"\n");
                                System.out.println("Choose what type of upgrade you want or just leave shop.");
				System.out.println("Enter 1 to upgrade rods, boat and Tackle Box\nEnter 2 to customize Rod\nEnter 3 to add engine\nEnter 4 to exit shop\nEnter 5 to leave this map and return later\nEnter 6 to save file");
				int rep4=scanner.nextInt();
				if(rep4==1)
                                {
                                    System.out.println("Which item do you want to buy");
                                    System.out.println("Rods\n1-Good Rod for P"+goodRod.getCost()+"\n2-Super Rod for P"+superRod.getCost()+"\n3-Master Rod for P"+masterRod.getCost());
                                    System.out.println("Tackle Boxes\n4-Good Box for P"+goodBox.getCost()+"\n5-Super Box for P"+superBox.getCost()+"\n6-Master Box for P"+masterBox.getCost()); 
                                    System.out.println("Boats\n7-Speed Boat for P"+speedBoat.getCost()+"\n8-Sharpedo Boat for P"+sharpedoBoat.getCost()); 
                                    int rep5= scanner.nextInt();
                                    if(rep5==1||rep5==2||rep5==3||rep5==4||rep5==5||rep5==6||rep5==7||rep5==8)
                                    {
					if(player.getMoney()>=shop.get(rep5).getCost())
                                        {
                                            player.setBuyMoney(shop.get(rep5).getCost());
                                            if(rep5==1||rep5==2||rep5==3)
                                            {
                                                player.getRod().resetRod();
                                                player.setRod(rod.get(rep5));
                                                
                                            }
                                            else if(rep5==4||rep5==5||rep5==6)
                                                player.setBox(box.get(rep5-3));
                                            else if(rep5==7||rep5==8)
                                                player.setBoat(boat.get(rep5-6));
                                            System.out.println(shop.get(rep5).getName()+" Obtained.");
                                        }
                                        else
                                        {
                                            System.out.println("Not enough money, buy something else.");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Not in the choices, buy something else.");
                                    }			
                                }
                                else if(rep4==2)
                                {
                                    System.out.println("Which rod customization do you want to buy");
                                    System.out.println("Lures\n1-Great Lure for P"+greatLure.getCost()+"\n2-Ultra Lure for P"+ultraLure.getCost()+"\n3-Master Lure for P"+masterLure.getCost());
                                    System.out.println("Lines\n4-Great Line for P"+greatLine.getCost()+"\n5-Ultra Line for P"+ultraLine.getCost()+"\n6-Master Line for P"+masterLine.getCost()); 
                                    System.out.println("Reels\n7-Great Reel for P"+greatReel.getCost()+"\n8-Ultra Reel for P"+ultraReel.getCost()+"\n9-Master Reel for P"+masterLine.getCost()); 
                                    int rep5= scanner.nextInt();
                                    if(rep5==1||rep5==2||rep5==3||rep5==4||rep5==5||rep5==6||rep5==7||rep5==8||rep5==9)
                                    {
					if(player.getMoney()>=customRod.get(rep5).getCost())
                                        {
                                            int transact=1;
                                            if(rep5==1||rep5==2||rep5==3)
                                                if(player.getRod().getLure().getType().equals("Nothing"))
                                                    player.getRod().setLure(customRod.get(rep5));
                                                else
                                                    transact=0;
                                            else if(rep5==4||rep5==5||rep5==6)
                                                if(player.getRod().getLine().getType().equals("Nothing"))
                                                    player.getRod().setLine(customRod.get(rep5));
                                                else
                                                    transact=0;                                                
                                            else if(rep5==7||rep5==8||rep5==9)
                                                if(player.getRod().getReel().getType().equals("Nothing"))
                                                    player.getRod().setReel(customRod.get(rep5));
                                                else
                                                    transact=0;
                                            if(transact==1)
                                            {
                                                System.out.println(customRod.get(rep5).getName()+" Obtained.");
                                                player.setBuyMoney(customRod.get(rep5).getCost());
                                            }
                                            else
                                            {
                                                System.out.println("There is already a customization in that point.");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("Not enough money, buy something else.");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Not in the choices, buy something else.");
                                    }	                                    
                                }
                                else if(rep4==3)
                                {
                                    System.out.println("Engine\n1-Team Aqua's Engine for P"+aquaEngine.getCost()); 
                                    if(player.getMoney()>=aquaEngine.getCost())
                                    {
                                        if(player.getBoat()!=lapras)
                                        {    int transact=1;
                                            if(player.getBoat().getEngine().getName().equals("Useless Engine"))
                                                player.getBoat().setEngine(aquaEngine);
                                            else
                                                transact=0;                                        
                                            if(transact==1)
                                            {
                                                System.out.println(aquaEngine.getName()+" Obtained.");
                                                player.setBuyMoney(aquaEngine.getCost());
                                            }
                                            else
                                            {
                                                System.out.println("There is already an engine.");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("Can't put engine on Lapras");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Not enough money, buy something else.");
                                    }
                                }
                                else if(rep4==4)
                                {
                                    leave=1;
                                }
                                else if (rep4==5)
                                {
                                    chosenMap.setCustomization(player.getRod().getLure(),player.getRod().getLine(), player.getRod().getReel(),player.getBoat().getEngine());                            
                                    player.getRod().resetRod();                                          
                                    leave=1;
                                    exit=1;
                                }
                                else if (rep4==6)
                                {
                                    try{
                                        FileOutputStream file = new FileOutputStream(player.getName()+".sav");
                                        ObjectOutputStream save = new ObjectOutputStream(file);
                                        save.writeObject(days);
                                        save.writeObject(lakeOfRage);
                                        save.writeObject(unionCave);
                                        save.writeObject(route119);
                                        save.writeObject(fioreSea);
                                        save.writeObject(marineCave);
                                        save.writeObject(player);
                                        for(int x=0;x<pokeList.size();x++)
                                        {
                                            save.writeObject(pokeList.get(x));
                                        }
                                        save.close();
                                    }
                                    catch(Exception e){
                                        e.printStackTrace();

                                    }
                                }
                                else
                                {
                                    System.out.println("Invalid Command");
                                }
                            }
                            
                        }
                        else if(player.checkBadges()==0&&chosenMap.getnLegend()==0)
                        {
                            System.out.println("Congratulation, you have captured the rare pokemon of the map, go hunt in other map.");
                            if(chosenMap==unionCave)
                            {
                                System.out.println("Do you want to set all your boats to Lapras with 25 moves?(yes/no)");
                                String rep6 = scanner.next();
                                if(rep6.equalsIgnoreCase("yes"))
                                player.setLaprasCaptured(lapras);
                                
                            }
                            chosenMap.setCustomization(player.getRod().getLure(),player.getRod().getLine(), player.getRod().getReel(),player.getBoat().getEngine());                            
                            player.getRod().resetRod();                            
                            exit=1;
                        }
                        else
                        {
                            int daysFinished = days;
                            days = limit;
                            victory = 1;
                            System.out.println("Congratulation, you have captured all rare pokemons in the game in just "+daysFinished+" days.");                          
			}
                    }

      
                }
                if(victory ==0)
		{
                    System.out.println("You lose the game for not being able to capture the rare pokemons within 30 days");
		}
        scanner.close();
	}	
}