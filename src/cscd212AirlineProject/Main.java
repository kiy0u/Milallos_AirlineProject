package cscd212AirlineProject;

import Interfaces.BoardingStrategy;
import Interfaces.FlyStrategy;
import Interfaces.ReservationBuilderInterface;
import Reservation.Reservation;
import Ticket.Ticket;
import cscd212classes.AirlineClass.Airline;
import cscd212classes.AirlineClass.CheapAirline;
import cscd212classes.AirlineClass.PremiumAirline;
import cscd212classes.AirplaneClass.Airbus320;
import cscd212classes.AirplaneClass.Airplane;
import cscd212classes.AirplaneClass.Boeing737;
import cscd212classes.AirportClass.Airport;
import cscd212classes.BoardingStrategies.GroupBoardingStrategy;
import cscd212classes.BoardingStrategies.PriorityBoardingStrategy;
import cscd212classes.BoardingStrategies.StandardBoardingStrategy;
import cscd212classes.FlightStrategies.ChoppyFlight;
import cscd212classes.FlightStrategies.SmoothFlight;
import Reservation.ReservationBuilder;
import Reservation.Reservation;
import cscd212classes.Layover;
import Ticket.SeatClassDecorator;
import Ticket.CheckedBagsDecorator;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Airport GEG = new Airport("GEG", "Spokane International Airport","Spokane, WA");
        Airport SEA = new Airport("SEA", "Seattle-Tacoma International Airport","SeaTac, WA");

        FlyStrategy smoothFlight = new SmoothFlight();
        FlyStrategy choppyFlight = new ChoppyFlight();

        BoardingStrategy priorityBoarding = new PriorityBoardingStrategy();
        BoardingStrategy standardBoarding = new StandardBoardingStrategy();
        BoardingStrategy groupBoarding = new GroupBoardingStrategy();

        Airplane boeing737 = new Boeing737(choppyFlight);
        Airplane airbus320 = new Airbus320(smoothFlight);

        Airline cheapAir = new CheapAirline("CheapAir", Arrays.asList(boeing737));
        Airline premiumAir = new PremiumAirline("PremiumAir", Arrays.asList(airbus320));

        Ticket ticket = new Ticket("Rizzi Christian Milallos", "04/10/2005", "economy class", "12A", "B", 1, 200.0);
        Ticket upgradedTicket = new SeatClassDecorator(ticket, "comfort class");
        Ticket upgradedTicketWithMoreBags = new CheckedBagsDecorator(upgradedTicket, 1) ;
        System.out.println(upgradedTicketWithMoreBags);

        Reservation reservation = new ReservationBuilder()
                .setSourceAirport(GEG)  // Set the source airport
                .setDestinationAirport(SEA)  // Set the destination airport
                .setAirline(premiumAir)  // Set the airline
                .setAirplane(airbus320)  // Set the airplane
                .setFlightDate("12/24/24")  // Set the flight date
                .setFlightTime("5:00am")  // Set the flight time
                .addTicket(upgradedTicketWithMoreBags)  // Add a ticket
                .addLayover(new Layover("LAX", 1, 30))  // Add a layover
                .build(priorityBoarding);  // Build the final Reservation object

        System.out.println(reservation);  // Print the Reservation object





    }
}