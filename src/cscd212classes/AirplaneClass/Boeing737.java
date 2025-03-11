package cscd212classes.AirplaneClass;

import Interfaces.FlyStrategy;

public class Boeing737 extends Airplane
{

    /**
     * Constructs a Boeing737 with the name, number of rows, seats per row and the flying strategy
     * @param flyStrategy flying strategy representing the strategy the airplane utilizes
     */
    public Boeing737(FlyStrategy flyStrategy)
    {
        super("Boeing 737", 30, 6, flyStrategy);
    }
}
