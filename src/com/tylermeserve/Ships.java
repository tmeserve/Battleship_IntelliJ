import java.util.Map;
import java.util.HashMap;
/**
 * Write a description of class Ships here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ships
{
    private Map<ShipTypes, Integer> sizeOfShip = new HashMap<ShipTypes, Integer>();
    // int[][]
    private Map<ShipTypes, int[][]> positionOfShips = new HashMap<ShipTypes, int[][]>();
    private Map<ShipTypes, Boolean> shipsDestryoed = new HashMap<ShipTypes, Boolean>();
    private ShipTypes shipType;
    
    public Ships(String[] types)
    {
        for (String type : types)
        {
            shipType = ShipTypes.valueOf(type.toUpperCase());
            
            if (type.equalsIgnoreCase("destroyer"))
            {
                sizeOfShip.put(shipType, 2);
            }
            else if (type.equalsIgnoreCase("submarine"))
            {
                sizeOfShip.put(shipType, 3);
            }
            else if (type.equalsIgnoreCase("cruiser"))
            {
                sizeOfShip.put(shipType, 3);
            }
            else if (type.equalsIgnoreCase("carrier"))
            {
                sizeOfShip.put(shipType, 5);
            }
            else if (type.equalsIgnoreCase("battleship"))
            {
                sizeOfShip.put(shipType, 4);
            }
        }
    }
}