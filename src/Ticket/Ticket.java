package Ticket;

public class Ticket
{
    /**
     * String representing the name
     */
    protected String name;
    /**
     * String representing the date of birth
     */
    protected String dob;
    /**
     * String representing the seatClass
     */
    protected String seatClass;
    /**
     * String representing the seat number
     */
    protected String seatNumber;
    /**
     * String representing the boardingClass
     */
    protected String boardingClass;
    /**
     * int representing the number of checked bags
     */
    protected int checkedBags;
    /**
     * double representing the cost
     */
    protected double cost;

    /**
     * Constructs a Ticket with the following parameters:
     * @param name String representing the name of the passenger
     * @param dob String representing the date of birth of the passenger
     * @param seatClass String representing the class of the passenger
     * @param seatNumber int representing the seat number of the passenger
     * @param boardingClass String representing the boardingClass of the passenger
     * @param checkedBags int representing the number of checked bags of the passenger
     * @param cost double representing the cost of the ticket
     */
    public Ticket(String name, String dob, String seatClass, String seatNumber, String boardingClass, int checkedBags, double cost)
    {
        this.name = name;
        this.dob = dob;
        this.seatClass = seatClass;
        this.seatNumber = seatNumber;
        this.boardingClass = boardingClass;
        this.checkedBags = checkedBags;
        this.cost = cost;

    }

    /**
     * Gets the cost of the ticket
     * @return int representing the cost of the ticket
     */
    public double getCost()
    {
        return this.cost;
    }

    /**
     * Gets the class of the seat
     * @return String representing the seat class
     */

    public String getSeatClass()
    {
        return this.seatClass;
    }

    /**
     * Gets the number of checked bags
     * @return int representing the checked bags
     */

    public int getCheckedBags()
    {
        return this.checkedBags;
    }

    /**
     * Gets the name of the passenger
     * @return String representing the name of the passenger
     */

    public String getName()
    {
        return this.name;
    }

    /**
     * Gets the date of birth of the passenger
     * @return String representing the birth of the passenger
     */

    public String getDob()
    {
        return this.dob;
    }

    /**
     * Gets the seat number of the passenger
     * @return String representing the seat number
     */

    public String getSeatNumber()
    {
        return this.seatNumber;
    }

    /**
     * Gets the boarding class of the passenger
     * @return String representing the boarding class of the passenger
     */

    public String getBoardingClass()
    {
        return this.boardingClass;
    }

    /**
     * toString() that represents the ticket, with the passenger details
     * @return
     */

    @Override
    public String toString()
    {
        return String.format("Ticket for: %s" + "\n" + "Seat: %s," + "\n" + "Class: %s" + "\n" + "Bags: %d" + "\n" + "Cost: %.2f",
                name, seatNumber, seatClass, checkedBags, cost);
    }
}
