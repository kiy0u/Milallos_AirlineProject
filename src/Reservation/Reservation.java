package Reservation;

import Interfaces.BoardingStrategy;
import Ticket.Ticket;
import cscd212classes.AirlineClass.Airline;
import cscd212classes.AirplaneClass.Airplane;
import cscd212classes.AirportClass.Airport;
import cscd212classes.Layover;

import java.util.List;

public class Reservation
{
    /**
     * List representing the tickets
     */
    private List<Ticket> tickets;
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
     * List representing the layovers
     */
    private List<Layover> layovers;
    /**
     * BoardingStrategy representing the boarding strategy
     */
    private BoardingStrategy boardingStrategy;
    /**
     * double representing the total cost
     */
    private double totalCost;

    /**
     * Constructs a Reservation object with the following parameters:
     * @param tickets List representing the tickets in the reservation
     * @param sourceAirport Airport representing the source airport
     * @param destinationAirport Airport representing the destination airport
     * @param airline Airline representing the airline
     * @param airplane Airplane representing the airplane
     * @param flightDate String representing the flight date
     * @param flightTime String representing the flight time
     * @param layovers List representing the layovers in the reservation
     * @param boardingStrategy BoardingStrategy representing what boarding strategy will be utilized
     */
    public Reservation(List<Ticket> tickets, Airport sourceAirport, Airport destinationAirport, Airline airline, Airplane airplane, String flightDate, String flightTime, List<Layover> layovers, BoardingStrategy boardingStrategy)
    {

        if(tickets == null || sourceAirport == null || destinationAirport == null || airline == null || airplane == null)
        {
            throw new IllegalArgumentException("Fields cannot be null");
        }
        this.tickets = tickets;
        this.sourceAirport = sourceAirport;
        this.destinationAirport = destinationAirport;
        this.airline = airline;
        this.airplane = airplane;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.layovers = layovers;
        this.totalCost = 0;
        this.boardingStrategy = boardingStrategy;
        calculateTotalCost();
    }

    /**
     * Calculates the total cost of the reservation
     *
     */
    private void calculateTotalCost()
    {
        totalCost = 0;
        for (Ticket ticket : tickets)
        {
            totalCost += ticket.getCost();
        }
    }

    /**
     * Returns a string representation of the reservation
     * @return String representing the reservation details
     */
    @Override
    public String toString() {
        StringBuilder layoverDetails = new StringBuilder();
        if (layovers != null && !layovers.isEmpty()) {
            layoverDetails.append("\nLayovers:");
            for (Layover layover : layovers) {
                layoverDetails.append("\n  ").append(layover.toString());
            }
        }

        String boardingType = boardingStrategy.toString();

         return String.format(
                "Reservation by %s from %s to %s on %s (%s). Airplane: %s. Total cost: %.2f\nBoarding Strategy: %s%s",
                this.airline, this.sourceAirport, this.destinationAirport,
                this.flightDate, this.flightTime, this.airplane, this.totalCost,
                boardingType,  // Include the boarding type
                layoverDetails.toString()
        );

    }

}
