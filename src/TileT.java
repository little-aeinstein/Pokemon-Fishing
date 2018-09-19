import java.io.Serializable;
public class TileT extends Tile implements Serializable {
    private Treasure treasure;
    /*Constructor*/    
    public TileT(char depth, Treasure treasure)
	{
            super(depth);
            this.treasure = treasure;
	}
    /*To get the Treasure of the Tile*/
    public Treasure getTreasure()
        {
            return this.treasure;
        }
    
    /*To get the Depth of the Tile*/
    public char getDepth()
    {
        return depth;
    }
}
