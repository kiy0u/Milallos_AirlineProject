package Reservation;

import Interfaces.BoardingStrategy;
import Interfaces.ReservationBuilderInterface;
import Ticket.Ticket;
import cscd212classes.AirlineClass.Airline;
import cscd212classes.AirplaneClass.Airplane;
import cscd212classes.AirportClass.Airport;
import cscd212classes.Layover;


import java.util.ArrayList;
import java.util.List;

public class ReservationBuilder implements ReservationBuilderInterface
{
    /**
     * List representing the tickets in the reservation
     */
    private List<Ticket> tickets = new ArrayList<>();
    /**
     * Airport representing the source airport
     */
    private Airport sourceAirport;
    /**
     * Airport representing the destination airport
     */
    private Airport destinationAirport;
    /**
     * Airline representing the airline
     */
    private Airline airline;
    /**
     * Airplane representing the airplane
     */
    private Airplane airplane;
    /**
     * String representing the flight date
     */
    private String flightDate;
    /**
     * String representing the flight time
     */
    private String flightTime;
    /**
     * List representing the layovers in th ereservation
     */
    private List<Layover> layovers = new ArrayList<>();

    /**
     * Sets the source airport for the reservation
     * @param sourceAirport the source airport
     * @return updated instance
     */
    @Override
    public ReservationBuilder setSourceAirport(Airport sourceAirport)
    {
        this.sourceAirport = sourceAirport;
        return this;
    }

    /**
     * Sets the destination airport for the reservation
     * @param destinationAirport the destination airport
     * @return updated instance
     */
    @Override
    public ReservationBuilder setDestinationAirport(Airport destinationAirport)
    {
        this.destinationAirport = destinationAirport;
        return this;
    }

    /**
     * Sets the airline for the reservation
     * @param airline The airline for the reservation
     * @return updated instance
     */

    @Override
    public ReservationBuilder setAirline(Airline airline)
    {
        this.airline = airline;
        return this;
    }

    /**
     * Sets the airplane for the reservation
     * @param airplane The airplane for the reservation
     * @return updated instance
     */

    @Override
    public ReservationBuilder setAirplane(Airplane airplane)
    {
        this.airplane = airplane;
        return this;
    }

    /**
     * Sets the flight date for the reservation
     * @param flightDate The flight date
     * @return updated instance
     */

    @Override
    public ReservationBuilder setFlightDate(String flightDate)
    {
        this.flightDate = flightDate;
        return this;
    }

    /**
     * Sets the flight time for the reservation
     * @param flightTime The flight time
     * @return updated instance
     */

    @Override
    public ReservationBuilder setFlightTime(String flightTime)
    {
        this.flightTime = flightTime;
        return this;
    }

    /**
     * Adds a ticket to the reservation
     * @param ticket The ticket that is to be added
     * @return updated instance
     */

    @Override
    public ReservationBuilder addTicket(Ticket ticket)
    {
        this.tickets.add(ticket);
        return this;
    }

    /**
     * Adds a layover to the reservation
     * @param layover The layover to be added
     * @return updated instance
     */

    @Override
    public ReservationBuilder addLayover(Layover layover)
    {
        this.layovers.add(layover);
        return this;
    }

    /**
     * Buidls the final reservation object with the boarding strategy
     * @param boardingStrategy The boarding strategy for the reservation
     * @return complete Reservation object
     */


    public Reservation build(BoardingStrategy boardingStrategy)
    {
        if (this.airline == null || this.airplane == null || this.sourceAirport == null || this.destinationAirport == null || this.tickets == null )
        {
            throw new NullPointerException("All fields are required");
        }

        if (boardingStrategy == null)
        {
            throw new NullPointerException("Boarding strategy is required");
        }
        return new Reservation(this.tickets, this.sourceAirport, this.destinationAirport, this.airline, this.airplane, this.flightDate, this.flightTime, this.layovers, boardingStrategy);
    }

}
