package cscd212classes.AirportClass;

public class Airport
{
    /**
     * String representing the code of the Airport
     */
    private String code;
    /**
     * String representing the name of the airport
     */
    private String name;
    /**
     * String representing the location of the airport
     */
    private String location;

    /**
     * Constructs an Airport with the code, name and location
     * @param code String representing the code of the airport
     * @param name String representing the name of the airport
     * @param location String representing the location of the airport
     */

    public Airport(String code, String name, String location)
    {
        this.code = code;
        this.name = name;
        this.location = location;
    }

    /**
     * Returns the airport's code
     * @return String representing the code of the airport
     */

    public String getCode()
    {
        return this.code;
    }

    /**
     * toString that returns the Airport and it's details
     * @return String in format name, code, location
     */

    @Override
    public String toString()
    {
        return String.format("%s %s %s", this.name, this.code, this.location);
    }
}
