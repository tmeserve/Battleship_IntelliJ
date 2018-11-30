
/**
 * Abstract class Board - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Board
{
    private int rows = 10;
    private int columns = 4;
    
    private Tile[][] gameboard = new Tile[rows][columns];
    public Tile[][] makeBoard()
    {
        
        
        return gameboard;
    }
}