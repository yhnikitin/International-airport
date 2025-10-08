package Project;

public abstract class AbstractFlightClass {
    private Airline airline;
    private Aircraft aircraft;
    private int flightNumber;
    private String destination;
    private String departureTime;
    private String departureGate;
    private Airport departureAirport;
    private Airport destinationAirport;

    public AbstractFlight(Airline airline,
                          Aircraft aircraft,
                          int flightNumber,
                          String destination,
                          String departureTime,
                          String departureGate,
                          Airport departureAirport,
                          Airport destinationAirport) {
        this.airline = airline;
        this.aircraft = aircraft;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.departureGate = departureGate;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public Airline getAirline() { return airline; }
    public Aircrafte getAircraft() { return aircraft; }
    public int getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public String getDepartureTime() { return departureTime; }
    public String getDepartureGate() { return departureGate; }
    abstract public int getFlightCost();
}
