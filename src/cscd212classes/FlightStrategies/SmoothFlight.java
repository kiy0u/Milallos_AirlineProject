package cscd212classes.FlightStrategies;

import Interfaces.FlyStrategy;

public class SmoothFlight implements FlyStrategy
{
    /**
     * A specific implementation of the FlyStrategy interface that simulates smooth flying conditions
     * @return String representing smooth flying conditions
     */

    @Override
    public String fly()
    {
        return "Smooth flight all throughout, very nice~ ";
    }
}
