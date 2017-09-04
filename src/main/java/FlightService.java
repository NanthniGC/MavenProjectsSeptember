import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class FlightService {


    private List<Flight> flightsList = Arrays.asList(new Flight("BA1234", "LHR", "MAA", 720),
            new Flight("LH463", "AMS", "SFO", 450),
            new Flight("EH978", "LHR", "DUB", 400),
            new Flight("SW938", "AMS", "BER", 250),
            new Flight("EY9856", "LHR", "AMS", 135));


    //extract flight numbers
    public List<String> getFlightNumber() {
        return flightsList.stream()
                .map(Flight::getFlightNumber)
                .collect(toList());

    }

    //to sort flight numbers by price
    public List<String> getSortedFlightPrice() {
        return flightsList.stream()
                .sorted((o1, o2) -> Integer.compare(o1.getFlightPrice(), o2.getFlightPrice()))
                .map(Flight::getFlightNumber)
                .collect(toList());

    }

    //to sort flights by price
    public List<Integer> getSortedPrice() {
        return flightsList.stream()
                .map(Flight::getFlightPrice)
                .sorted(Integer::compare)
                .collect(toList());

    }

    //group by origin
    public Map<String, List<Flight>> getFlightByOrigin() {
        return flightsList
                .stream()
                .collect(groupingBy(Flight::getFlightOrigin));
    }

    //to retrieve particular origin
    public Map<String, List<Flight>> getFlightByParticularOrigin(String origin) {
        return flightsList
                .stream()
                .filter(e -> e.getFlightOrigin().equalsIgnoreCase(origin) )
                .collect(groupingBy(Flight::getFlightOrigin));


    }
}
