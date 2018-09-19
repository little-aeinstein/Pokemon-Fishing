import java.io.Serializable;
public class TileU extends Tile implements Serializable {
    /*Constructor*/    
    public TileU(char depth)
	{
            super(depth);
	}
    /*To get the Depth of the Tile*/
    public char getDepth()
    {
        return depth;
    }     
}
