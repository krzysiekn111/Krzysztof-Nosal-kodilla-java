package flying.company;

import java.util.ArrayList;
import java.util.List;

public class PlaneFlightSearcher {
    private Data data;

    PlaneFlightSearcher(Data data) {
        this.data = data;
    }

    public List<FlyingDirections> directFlight(String from, String to) {
        return data.getList().stream()
                .filter(flight -> flight.getFrom().equals(from) && flight.getTo().equals(to))
                .toList();
    }

    /**
     * Metoda zwraca pary lotów przesiadkowych.
     */
    public List<FlyingDirections> connectionFlight(String from, String to) {
        List<FlyingDirections> result = new ArrayList<>();
        //1. Znajdz wszystkie loty z from. To potencjalne pierwsze polaczenia.
        List<FlyingDirections> flyingDirections = flightFrom(from);
        //2. Idziesz po lotach z pkt 1. i szukasz lotow do 'to' z lotnisk do których moglbys doleciec w pkt 1;
        for (FlyingDirections firstFlight : flyingDirections) {
            List<FlyingDirections> secondFlights = flightFrom(firstFlight.getTo());
            for (FlyingDirections secondFlight : secondFlights) {
                if (secondFlight.getTo().equals(to)) {
                    //firstFlight + secondFlish to polaczenie ktorym sie dostaniemy z 1 przesiadka
                    result.add(firstFlight);
                    result.add(secondFlight);
                }
            }
        }

        return flyingDirections;
    }

    public List<FlyingDirections> flightTo(String to) {
        return data.getList().stream()
                .filter(i -> i.getTo().equals(to))
                .toList();
    }

    public List<FlyingDirections> flightFrom(String from) {
        return data.getList().stream()
                .filter(i -> i.getFrom().equals(from))
                .toList();
    }
}
