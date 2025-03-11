package cscd212classes.AirplaneClass;

import Interfaces.FlyStrategy;

public class Airbus320 extends Airplane
{
    /**
     * Constructs an Airbus320 with the name,  number of rows, seats per row and the flying strategy
     * @param flyStrategy flying strategy representing the strategy the airplane utilizes
     */

    public Airbus320(FlyStrategy flyStrategy)
    {
        super("Airbus 320", 25, 6, flyStrategy);
    }
}
