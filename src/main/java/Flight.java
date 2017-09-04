/**
 * Created by gc on 3/9/17.
 */
public class Flight {
    private String flightNumber;
    private String flightOrigin;
    private String flightDestination;
    private int flightPrice;

    public Flight() {
    }

    public Flight(String number, String origin, String destination, int price) {
        this.flightNumber = number;
        this.flightPrice = price;
        this.flightOrigin = origin;
        this.flightDestination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
    //    public void setFlightNumber(int flightNumber) {
    //        this.flightNumber = flightNumber;
    //    }

    public int getFlightPrice() {
        return flightPrice;
    }

    //    public void setFlightPrice(int flightPrice) {
    //        this.flightPrice = flightPrice;
    //    }

    public String getFlightOrigin() {
        return flightOrigin;
    }

    //    public void setFlightOrigin(String flightOrigin) {
    //        this.flightOrigin = flightOrigin;
    //    }

    public String getFlightDestination() {
        return flightDestination;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "flightNumber='" + flightNumber + '\'' +
                ", flightOrigin='" + flightOrigin + '\'' +
                ", flightDestination='" + flightDestination + '\'' +
                ", flightPrice=" + flightPrice +
                '}';
    }

//

}
