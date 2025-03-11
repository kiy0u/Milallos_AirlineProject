package Ticket;

public abstract class TicketDecorator extends Ticket
{
    /**
     * Ticket representing the ticket object
     */
    protected Ticket ticket;

    /**
     * Constructs a Ticket Decorator with the ticket parameter
     * @param ticket ticket being decorated
     */
    public TicketDecorator(Ticket ticket)
    {
        super(ticket.name, ticket.dob, ticket.seatClass, ticket.seatNumber, ticket.boardingClass, ticket.checkedBags, ticket.getCost());
        this.ticket = ticket;
    }

    /**
     * Gets the cost of the ticket, delegating it to the decorated ticket
     * @return cost of the ticket
     */

    @Override
    public double getCost()
    {
        return ticket.getCost();
    }

    /**
     * toString returns the string representation of the ticket, delegating it to the decorated ticket
     * @return String showing the details
     */

    @Override
    public String toString()
    {
        return ticket.toString();
    }
}
