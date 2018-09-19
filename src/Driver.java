import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class Driver {
	public static void main(String[] args)
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
				
		                ArrayList<Map> mapList = new ArrayList<Map>();
		                mapList.add(lakeOfRage);
		                mapList.add(unionCave);
		                mapList.add(route119);
		                mapList.add(fioreSea);
		                mapList.add(marineCave);
		                
		                
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
		                
				ArrayList<Shop> shopList = new ArrayList<Shop>();
		                ArrayList<FishingRod> rodList = new ArrayList<FishingRod>();
		                ArrayList<TackleBox> boxList = new ArrayList<TackleBox>();
		                ArrayList<Boat> boatList = new ArrayList<Boat>();
		                shopList.add(lapras);
				shopList.add(goodRod);
		                shopList.add(superRod);
		                shopList.add(masterRod);
		                shopList.add(goodBox);
		                shopList.add(superBox);
		                shopList.add(masterBox);
		                shopList.add(speedBoat);
		                shopList.add(sharpedoBoat);
		                rodList.add(oldRod);
		                rodList.add(goodRod);
		                rodList.add(superRod);
		                rodList.add(masterRod);
		                boxList.add(basicBox);
		                boxList.add(goodBox);
		                boxList.add(superBox);
		                boxList.add(masterBox);
		                boatList.add(rowBoat);
		                boatList.add(speedBoat);
		                boatList.add(sharpedoBoat);
		                boatList.add(lapras);  
		                
		                CustomizationRod greatLure = new CustomizationRod("Great Lure",500,.05,.05,"Lure");
		                CustomizationRod ultraLure = new CustomizationRod("Ultra Lure",700,.1,.05,"Lure");
		                CustomizationRod masterLure = new CustomizationRod("Master Lure",900,.3,.07,"Lure"); 
		           
		                CustomizationRod greatLine = new CustomizationRod("Great Line",700,0,.1,"Line");
		                CustomizationRod ultraLine = new CustomizationRod("Ultra Line",800,0,.15,"Line");
		                CustomizationRod masterLine = new CustomizationRod("Master Line",900,.0,.25,"Line");
		                
		                CustomizationRod greatReel = new CustomizationRod("Great Reel",800,.1,.1,"Reel");
		                CustomizationRod ultraReel = new CustomizationRod("Ultra Reel",950,.18,.18,"Reel");
		                CustomizationRod masterReel = new CustomizationRod("Master Reel",1000,.21,.21,"Reel");
		                
		                ArrayList<CustomizationRod> customRodList = new ArrayList<CustomizationRod>();
		                customRodList.add(greatLure);
		                customRodList.add(ultraLure);
		                customRodList.add(masterLure); 
		                
		                customRodList.add(greatLine);
		                customRodList.add(ultraLine);
		                customRodList.add(masterLine);  
		                
		                customRodList.add(greatReel);
		                customRodList.add(ultraReel);
		                customRodList.add(masterReel);
		                
		                Engine aquaEngine = new Engine("Team Aqua's Engine",1000,2);
				//---------------------------------------------------------------------------------------------------------------;

		try {
			StartPage page = new StartPage(player, mapList, rodList, customRodList, boatList, boxList, aquaEngine);
			page.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
