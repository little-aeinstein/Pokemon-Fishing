import java.io.Serializable;
public class TilePort extends Tile implements Serializable {
    private static final long serialVersionUID = 1L;
    /*Constructors*/
    public TilePort(){
        
    }
    public TilePort(char depth)
	{
            super(depth);
	}
    /*To get the Depth of the Tile*/
    public char getDepth()
    {
        return depth;
    }     
}
