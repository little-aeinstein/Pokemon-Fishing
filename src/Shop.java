/*This class contains the common properties and methods of the things in the shop*/
public abstract class Shop{
	protected String name;
	protected int cost;
/*Constructors*/        
	public Shop()
        {
            
        }
	public Shop(String name, int cost){
		this.name = name;
                this.cost = cost;
	}
/*To get the Name of the Rod*/	
	public abstract String getName();

/*To get the Cost of the Rod*/		
	public abstract int getCost();

}