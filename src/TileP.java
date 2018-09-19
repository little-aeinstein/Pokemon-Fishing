import java.io.Serializable;
public class TileP extends Tile implements Serializable {
    private Pokemon pokemon;
    /*Constructor*/
    public TileP(char depth,Pokemon pokemon)
	{
            super(depth);
            this.pokemon = pokemon;
	}
    /*To get the Pokemon of the Tile*/
    public Pokemon getPokemon()
        {
            return this.pokemon;
        }
    /*To get the Depth of the Tile*/  
    public char getDepth()
    {
        return depth;
    }   
}
