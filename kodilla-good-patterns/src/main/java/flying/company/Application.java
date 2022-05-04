package flying.company;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        String krakow = "Kraków";
        String warszawa = "Warszawa";
        String poznan = "Poznań";

        FlyingDirections flyingDirection1 = new FlyingDirections(krakow, poznan);
        FlyingDirections flyingDirection2 = new FlyingDirections(krakow, warszawa);
        FlyingDirections flyingDirection3 = new FlyingDirections(poznan, warszawa);
        FlyingDirections flyingDirection4 = new FlyingDirections(poznan, krakow);
        FlyingDirections flyingDirection5 = new FlyingDirections(warszawa, poznan);
        FlyingDirections flyingDirection6 = new FlyingDirections(warszawa, krakow);


        List<FlyingDirections> flyingDirections = new ArrayList<>();
        flyingDirections.add(flyingDirection1);
        flyingDirections.add(flyingDirection2);
        flyingDirections.add(flyingDirection3);
        flyingDirections.add(flyingDirection4);
        flyingDirections.add(flyingDirection5);
        flyingDirections.add(flyingDirection6);
        Data data = new Data(flyingDirections);

        PlaneFlightSearcher planeFlightSearcher = new PlaneFlightSearcher(data);
        planeFlightSearcher.directFlight(krakow, poznan);
        planeFlightSearcher.connectionFlight(warszawa, poznan);
        planeFlightSearcher.flightTo(krakow);
        planeFlightSearcher.flightFrom(krakow);
    }
}
