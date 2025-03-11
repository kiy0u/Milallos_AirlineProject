package cscd212classes.FlightStrategies;

import Interfaces.FlyStrategy;

public class ChoppyFlight implements FlyStrategy
{
    /**
     * A specific implementation of the FlyStrategy interface that simulates rough flying conditions
     * @return String representing undesirable flying conditions
     */
    @Override
    public String fly()
    {
        return "Choppy flight, lots of turbulence, you could've crashed... not nice :( ";
    }
}
