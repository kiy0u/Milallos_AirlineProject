package cscd212classes.AirlineClass;

import cscd212classes.AirplaneClass.Airplane;

import java.util.List;

public class CheapAirline extends Airline
{
    /**
     * This constructor constructs a CheapAirline with the name and fleet of airplanes.
     * @param name String representing the name of the CheapAirline
     * @param fleet A list of Airplanes that make up the fleet
     */

    public CheapAirline(String name, List<Airplane> fleet)
    {
        super(name, fleet);
    }

    /**
     * toString() returns the cheap airline
     * @return String representation of the cheap airline
     */

    @Override
    public String toString()
    {
        return "Low-Cost Airline: " + super.toString();
    }


}
