package flying.company;

import java.util.List;

public class PlaneFlightSearcher {
    private Data data;

    PlaneFlightSearcher(Data data) {
        this.data = data;
    }

    public List<FlyingDirections> directFlight(String from, String to) {
        List <FlyingDirections> flyingDirections = data.getList().stream()
                .filter(i -> i.getFrom()==from && i.getTo()==to)
                .toList();
        System.out.println(flyingDirections);
        return flyingDirections;
    }

    public List<FlyingDirections> connectionFlight(String from, String to) {
        List <FlyingDirections> flyingDirections = data.getList().stream()
                .filter(i -> i.getFrom()==from || i.getTo()==to)
                .toList();
        System.out.println(flyingDirections);
        return flyingDirections;
    }

    public void flightTo(String to) {
        List <FlyingDirections> flyingDirections = data.getList().stream()
                .filter(i -> i.getTo()==to)
                .toList();
        System.out.println("Flight to: " + to + "\n" + flyingDirections);
    }

    public void flightFrom(String from) {
        List <FlyingDirections> flyingDirections = data.getList().stream()
                .filter(i -> i.getFrom()==from)
                .toList();
        System.out.println("Flight from: " + from + "\n" + flyingDirections);
    }
}
