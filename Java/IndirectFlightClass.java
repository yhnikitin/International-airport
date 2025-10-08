package Project;

public class IndirectFlight extends AbstractFlight {

    private int flightCost;
    private AirportInterface[] transitAirports;

    public IndirectFlight(AirlineInterface airline,
                          AircraftInterface aircraft,
                          int flightNumber,
                          String destination,
                          String departureTime,
                          String departureGate,
                          AirportInterface departureAirport,
                          AirportInterface destinationAirport,
                          AirportInterface[] transitAirports) {
        super(airline, aircraft, flightNumber, destination, departureTime, departureGate, departureAirport, destinationAirport);
        this.transitAirports = transitAirports;
        this.flightCost = airline.getProfitMargin() * airline.getCostPerCustomer();
        for (AirportInterface airport : this.transitAirports) {
            this.flightCost = this.flightCost + airport.getRefuelingLevy();
        }
    }

    @Override
    public int getFlightCost() {
        return flightCost;
    }
}
