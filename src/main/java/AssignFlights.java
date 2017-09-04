import java.util.Arrays;
import java.util.List;

/**
 * Created by gc on 3/9/17.
 */
public class AssignFlights {
    public static void main(String[] a) {

        List<Flight> flightsList = Arrays.asList(new Flight("BA1234", "LHR ", " MAA", 720),
                                                  new Flight("LH463", "AMS", " SFO", 450),
                                                  new Flight("EH978", "LHR ", " DUB", 400),
                                                  new Flight("SW938", "AMS ", " BER", 250),
                                                  new Flight("EY9856", "LHR ", " AMS", 135));

        FlightService flightService = new FlightService();
        System.out.println("\n\t FlightNumber \n");
        System.out.println("to extract flight number" + flightService.getFlightNumber());
        System.out.println("**********************************************************");
        System.out.println("\n\t SortedFlightPrice \n");
        System.out.println(flightService.getSortedFlightPrice());
        System.out.println("**********************************************************");
        System.out.println("\n\t SortedPrice \n ");
        System.out.println(flightService.getSortedPrice());
        System.out.println("**********************************************************");
        System.out.println("\n\t FlightByOrigin \n ");
        System.out.println(flightService.getFlightByOrigin());
        System.out.println("**********************************************************");
        System.out.println("\n\t FlightByParticularOrigin \n ");
        System.out.println(flightService.getFlightByParticularOrigin("lhR"));
        System.out.println("**********************************************************");
        System.out.println("\n\t flightsList \n");
        System.out.println(flightsList);

        //        //sort numbers by price
        //        flightsList
        //                .stream()
        //                .sorted(e -> Comparator.comparingInt(Flight::getFlightPrice))
        //                .forEachOrdered(e-> System.out.println(e.getFlightNumber()));
        //
        //        //group by origin
        //        flightsList
        //                .stream()
        //                .collect(e -> groupingBy(Flight::getFlightOrigin))
        //                .foreach(e -> System.out.println(e));
        //
        //        //to retrieve particular origin
        //        flightsList
        //                .stream()
        //                .filter(e -> {
        //                    return e.getFlightOrigin().equals(Flight.getFlightOrigin("lhr"));
        //                })
        //                .forEach(e -> System.out.println(e));


    }


}
