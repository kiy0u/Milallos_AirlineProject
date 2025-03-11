package Interfaces;

import Reservation.Reservation;
import Reservation.ReservationBuilder;
import Ticket.Ticket;
import cscd212classes.AirlineClass.Airline;
import cscd212classes.AirplaneClass.Airplane;
import cscd212classes.AirportClass.Airport;
import cscd212classes.Layover;


public interface ReservationBuilderInterface
{
    /**
     * Sets the source airport for the reservation
     * @param sourceAirport the source airport
     * @return updated instance
     */
    ReservationBuilderInterface setSourceAirport(Airport sourceAirport);

    /**
     * Sets the destination airport for the reservation
     * @param destinationAirport the destination airport
     * @return updated instance
     */
    ReservationBuilderInterface setDestinationAirport(Airport destinationAirport);

    /**
     * Sets the airline for teh reservation
     * @param airline The airline for the reservation
     * @return updated instance
     */
    ReservationBuilderInterface setAirline(Airline airline);

    /**
     * Sets the airplane for the reservation
     * @param airplane The airplane for the reservation
     * @return updated instance
     */
    ReservationBuilderInterface setAirplane(Airplane airplane);

    /**
     * Sets the flight time for the reservation
     * @param flightDate The flight date
     * @return updated instance
     */
    ReservationBuilderInterface setFlightDate(String flightDate);

    /**
     * Sets the flight time for the reservation
     * @param flightTime The flight time
     * @return updated interface
     */
    ReservationBuilderInterface setFlightTime(String flightTime);

    /**
     * Adds a ticket to the reservation
     * @param ticket The ticket that is to be added
     * @return updated instance
     */
    ReservationBuilderInterface addTicket(Ticket ticket);

    /**
     * Adds a layover to the reservation
     * @param layover The layover to be added
     * @return updated instance
     */
    ReservationBuilderInterface addLayover(Layover layover);


    /**
     * Builds the final reservation object with the configured elements
     * @param boardingStrategy The boarding strategy for the reservation
     * @return The final reservation object
     */
    Reservation build(BoardingStrategy boardingStrategy);
}
