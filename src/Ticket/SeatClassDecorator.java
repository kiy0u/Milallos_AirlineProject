package Ticket;

public class SeatClassDecorator extends TicketDecorator
{
    /**
     * double representing the cost for an economy
     */
    private static final double ECONOMY_COST = 50.0;
    /**
     * double representing the cost for first class
     */
    private static final double COMFORT_CLASS = 100.0;
    /**
     * double representing the cost for first class
     */
    private static final double FIRST_CLASS = 300.0;

    /**
     * double representing the additional cost
     */
    private double additionalCost;

    /**
     * Cosntructs a SeatClassDecorator and takes in the ticket and seat class
     * @param ticket The base ticket to be decorated
     * @param seatClass The seatClass to be selected
     */
    public SeatClassDecorator(Ticket ticket, String seatClass)
    {
        super(ticket);
        this.seatClass = seatClass;
        applySeatClassCost();
    }

    /**
     * Applies the cost of the selected seat class to the ticket cost
     */

    private void applySeatClassCost()
    {
        switch (seatClass.toLowerCase())
        {
            case "economy class":
                additionalCost = ECONOMY_COST;
                break;
            case "comfort class":
                additionalCost = COMFORT_CLASS;
                break;
            case "first class":
                additionalCost = FIRST_CLASS;
                break;
            default:
                throw new IllegalArgumentException("Invalid seatClass" + seatClass);
        }
    }

    /**
     * Gets the total cost of the ticket, including the additional cost for the selected seat class
     * @return The total cost of the ticket
     */

    @Override
    public double getCost()
    {
        return this.ticket.getCost() + additionalCost;
    }

    /**
     * toString() returns the string representation of the ticket, including the seat class and price
     * @return String in format ticket, Seat Class Upgrade seatclass (Additional Cost: additionalCost)
     */

    @Override
    public String toString()
    {
        return super.toString() + String.format(", Seat Class Upgrade: %s (Additional Cost: %.2f)", seatClass, additionalCost);
    }
}
