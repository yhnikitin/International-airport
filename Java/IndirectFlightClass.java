package Project;

public class IndirectFlightClass extends AbstractFlight {
    private int flightCost;
    private Airport[] transitAirports;

    public IndirectFlight(Airline airline,
                          Aircraft aircraft,
                          int flightNumber,
                          String destination,
                          String departureTime,
                          String departureGate,
                          Airport departureAirport,
                          Airport destinationAirport,
                          Airport[] transitAirports) {
        super(airline, aircraft, flightNumber, destination, departureTime, departureGate, departureAirport, destinationAirport);
        this.transitAirports = transitAirports;
        this.flightCost = airline.getProfitMargin() * airline.getCostPerCustomer();
        for (Airport airport : this.transitAirports) {
            this.flightCost = this.flightCost + airport.getRefuelingLevy();
        }
    }

    @Override
    public int getFlightCost() {
        return flightCost;
    }
}
