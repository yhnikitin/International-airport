package Project;

public class DirectFlight extends AbstractFlight {

    int flightCost;

    public DirectFlight(AirlineInterface airline,
                        AircraftInterface aircraft,
                        int flightNumber,
                        String destination,
                        String departureTime,
                        String departureGate,
                        AirportInterface departureAirport,
                        AirportInterface destinationAirport) {
        super(airline, aircraft, flightNumber, destination, departureTime, departureGate,  departureAirport, destinationAirport);
        flightCost = airline.getCostPerCustomer() * airline.getProfitMargin();
    }

    @Override
    public int getFlightCost() {
        return flightCost;
    }
}
