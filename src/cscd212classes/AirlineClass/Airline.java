package cscd212classes.AirlineClass;

import cscd212classes.AirplaneClass.Airplane;

import java.util.List;

public abstract class Airline
{
    /**
     * String representing the name of the Airline
     */
    private String name;

    /**
     * List representing the Airline's fleet
     */
    private List<Airplane> fleet;

    /**
     * Constructs an Airline with the name and fleet of airplanes
     * @param name String representing the name of the Airline
     * @param fleet List representing the Airline's fleet
     */

    public Airline(String name, List<Airplane> fleet)
    {
        this.name = name;
        this.fleet = fleet;
    }

    /**
     * Returns name of the airline
     * @return String representing the name of the Airline
     */

    public String getName()
    {
        return this.name;
    }

    /**
     * Returns the list of airplanes in the fleet
     * @return Airplane representing an airplane
     */

    public List<Airplane> getFleet()
    {
        return this.fleet;
    }


    /**
     * toString() returns the name
     * @return the name which is the Airline name
     */
    @Override
    public String toString()
    {
        return this.name;
    }
}
