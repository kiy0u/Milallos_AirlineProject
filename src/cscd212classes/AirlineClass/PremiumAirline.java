package cscd212classes.AirlineClass;

import cscd212classes.AirplaneClass.Airplane;

import java.util.List;

public class PremiumAirline extends Airline
{
    /**
     * This constructor constructs a PremiumAirline with the name and fleet of airplanes
     * @param name String representing the name of the PremiumAirline
     * @param fleet A list of Airplanes that make up the fleet
     */

    public PremiumAirline(String name, List<Airplane> fleet)
    {
        super(name, fleet);
    }

    /**
     * toString() returns the premium airline
     * @return String representation of the premium airline
     */

    @Override
    public String toString()
    {
        return "Premium Airline: " + super.toString();
    }
}
