import java.io.Serializable;
public abstract class Tile implements Serializable{
	protected char depth;
        private static final long serialVersionUID = 1L;
    /*Constructor*/        
        public Tile()
        {
            
        }
	public Tile(char depth)
	{
		this.depth = depth;
	}

     /*To get the Depth of the Tile*/       
        public abstract char getDepth();
    /*To get the Pokemon of the Tile*/        
        public Pokemon getPokemon(){return null;}
     /*To get the Treasure of the Tile*/
        public Treasure getTreasure(){return null;}

}