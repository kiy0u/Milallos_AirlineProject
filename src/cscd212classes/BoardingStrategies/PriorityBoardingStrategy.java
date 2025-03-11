package cscd212classes.BoardingStrategies;

import Interfaces.BoardingStrategy;

public class PriorityBoardingStrategy implements BoardingStrategy
{

    /**
     * Returns what boarding strategy will be used
     * @return String describing the boarding strategy
     */
    @Override
    public String toString()
    {
        return "This flight will use Priority Boarding. You will be boarding by seat class.";
    }

}
