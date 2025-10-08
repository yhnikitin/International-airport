package Project;

import java.sql.Time;

public interface AbstractFlightInterface {

    public int getFlightNum();

    public String getDestination();

    public Time getDepartureTime();

    public String getDepartureGate();

    public String getAirline();

    public String getAircraft();

    abstract public int getFlightCost();
}
