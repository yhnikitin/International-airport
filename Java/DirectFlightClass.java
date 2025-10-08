package Project;

public class DirectFlight extends AbstractFlight {
    int flightCost;

    public DirectFlight(Airline airline,
                        Aircraft aircraft,
                        int flightNumber,
                        String destination,
                        String departureTime,
                        String departureGate,
                        Airport departureAirport,
                        Airport destinationAirport) {
        super(airline, aircraft, flightNumber, destination, departureTime, departureGate,  departureAirport, destinationAirport);
        this.flightCost = airline.getCostPerCustomer() * airline.getProfitMargin();
    }

    @Override
    public int getFlightCost() {
        return this.flightCost;
    }
}
