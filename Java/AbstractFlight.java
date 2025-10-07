package Project;

public abstract class AbstractFlight {
    private AirlineInterface airline;
    private AircraftInterface aircraft;
    private int flightNumber;
    private String destination;
    private String departureTime;
    private String departureGate;
    private AirportInterface departureAirport;
    private AirportInterface destinationAirport;

    public AbstractFlight(AirlineInterface airline,
                          AircraftInterface aircraft,
                          int flightNumber,
                          String destination,
                          String departureTime,
                          String departureGate,
                          AirportInterface departureAirport,
                          AirportInterface destinationAirport) {
        this.airline = airline;
        this.aircraft = aircraft;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.departureGate = departureGate;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public AirlineInterface getAirline() { return airline; }
    public AircraftInterface getAircraft() { return aircraft; }
    public int getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public String getDepartureTime() { return departureTime; }
    public String getDepartureGate() { return departureGate; }
    abstract public int getFlightCost();

}
