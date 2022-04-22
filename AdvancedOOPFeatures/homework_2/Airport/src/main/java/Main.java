import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    Airport airport = Airport.getInstance() ;
    findPlanesLeavingInTheNextTwoHours(airport);
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        return airport.getTerminals().stream()
                .map(Terminal::getFlights).flatMap(Collection::stream)
                .filter(flight -> flight.getType() == Flight.Type.DEPARTURE
                        && flight.getDate().getTime() > System.currentTimeMillis()
                        && flight.getDate().getTime() < System.currentTimeMillis() + 7200000)
                .collect(Collectors.toList());
    }

}













