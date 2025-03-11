package cscd212classes;

public class Layover
{
    /**
     * String representing the code of the airport
     */
    private String airportCode;
    /**
     * int representing the number of hours spent at the layover
     */
    private int hours;
    /**
     * int representing the number of minutes spent at the layover
     */
    private int minutes;

    /**
     * Constructs a Layover with airport code, hours and minutes spent at the layover
     * @param airportCode String representing the code of the airport
     * @param hours int representing the number of hours spent at the airport
     * @param minutes int representing the number of minutes spent at the airport
     */
    public Layover(String airportCode, int hours, int minutes)
    {
        this.airportCode = airportCode;
        this.hours = hours;
        this.minutes = minutes;
    }

    /**
     * toString() returns the representation of the layover
     * @return String in format "Layover at airport code, hours, minutes"
     */
    @Override
    public String toString()
    {
        return String.format("Layover at %s:%d:%d", this.airportCode, this.hours, this.minutes);
    }
}
