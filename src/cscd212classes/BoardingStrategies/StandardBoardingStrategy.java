package cscd212classes.BoardingStrategies;

import Interfaces.BoardingStrategy;

public class StandardBoardingStrategy implements BoardingStrategy
{

    /**
     * Returns what boarding strategy will be used
     * @return String describing the boarding strategy
     */
    public String toString()
    {
        return "This flight will use Standard Boarding Strategy. You will be boarding by row.";
    }


}
