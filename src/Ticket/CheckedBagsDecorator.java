package Ticket;

public class CheckedBagsDecorator extends TicketDecorator
{
    /**
     * double representing the cost per bag
     */
    private static final double BAG_COST = 35.0;
    /**
     * the number for additional bags
     */
    private int additionalBags;

    /**
     * Constructs the CheckedBagsDecorator for a given ticket with additional bags
     * @param ticket The base ticket to be decorated
     * @param additionalBags The number of additional bags
     */

    public CheckedBagsDecorator(Ticket ticket, int additionalBags)
    {
        super(ticket);
        this.additionalBags = additionalBags;
        applyBagCost();
    }

    /**
     * Applies the cost of additional bags to the ticket's cost
     */
    private void applyBagCost()
    {
        this.checkedBags += additionalBags;
        this.cost += additionalBags * BAG_COST;
    }

    /**
     * Gets the total cost of the ticket, including the additional cost for checked bags
     * @return total cost of the ticket
     */

    @Override
    public double getCost()
    {
        return this.ticket.getCost() + (additionalBags * BAG_COST);
    }

    /**
     * Returns a string representation of the ticket, including the additional bags
     * @return String with the base ticket details, with additional bags
     */

    @Override
    public String toString()
    {
        return super.toString() + String.format(", Additional Bags: %d (Additional Cost: %.2f)", additionalBags, additionalBags * BAG_COST);
    }

}
