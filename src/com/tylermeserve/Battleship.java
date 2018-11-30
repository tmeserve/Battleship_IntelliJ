package  com.tylermeserve;
/**
 * Write a description of class Battleship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battleship extends Board
{
    private Tile[][] gameboard = makeBoard();
    
    public String toString()
    {
        String toReturn = "";
        for (Tile[] row : gameboard)
        {
            for (Tile tile : row)
            {
                if (tile)
                    toReturn = toReturn + tile + "\t";
                else
                    toReturn = toReturn + tile + "\t";
            }
            toReturn = toReturn + "\n";
        }
        
        return toReturn;
    }
}