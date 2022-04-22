import core.Line;
import core.Station;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RouteCalculatorTest extends TestCase {
    //Маршруты
    List<Station> threeTransfers = new ArrayList<>();
    List<Station> twoTransfers = new ArrayList<>();
    List<Station> routeWithoutTransfers = new ArrayList<>();


    Station pervaya;
    Station vtoraya;
    Station tretya;
    Station krasnaya;
    Station rozovaya;
    Station quadratnaya;
    StationIndex stationIndex = new StationIndex();

    protected void setUp() throws Exception {

        Line firstLine = new Line(1, "First");
        Line secondLine = new Line(2, "Second");
        Line thirdLine = new Line(3, "Third");
        //Станции первой линии
        pervaya = new Station("Первая", firstLine);
        Station vtoraya = new Station("Вторая", firstLine);
        tretya = new Station("Третья", firstLine);
        // Станции второй линии
        krasnaya = new Station("Красная", secondLine);
        Station zelenaya = new Station("Зеленая", secondLine);
        rozovaya = new Station("Розовая", secondLine);
        //Станции третьей линии
        quadratnaya = new Station("Квадратная", thirdLine);
        Station treugolnaya = new Station("Треугольная", thirdLine);
        Station kruglaya = new Station("Круглая", thirdLine);
        // Переходы
        List<Station> firstConnect = new ArrayList<>();
        List<Station> secondConnect = new ArrayList<>();
        firstConnect.add(pervaya);
        firstConnect.add(krasnaya);
        secondConnect.add(rozovaya);
        secondConnect.add(kruglaya);
        // Заполняем маршруты
        threeTransfers.add(pervaya);
        threeTransfers.add(krasnaya);
        threeTransfers.add(zelenaya);
        threeTransfers.add(rozovaya);
        threeTransfers.add(kruglaya);
        twoTransfers = Stream.of(tretya, vtoraya, pervaya, krasnaya, zelenaya,rozovaya).collect(Collectors.toList());
        routeWithoutTransfers = Stream.of(pervaya, vtoraya, tretya).collect(Collectors.toList());


    }

    public void testCalculateDurationTwoTransfers() {
        double actual = RouteCalculator.calculateDuration(twoTransfers);
        double expected = 11;
        assertEquals(expected, actual);

    }

    public void testGetShortestRoute() {
        RouteCalculator routeCalculator = new RouteCalculator(stationIndex);
        List<Station> actual = routeCalculator.getShortestRoute(tretya, rozovaya);
        assertEquals(twoTransfers, actual);
    }


}


