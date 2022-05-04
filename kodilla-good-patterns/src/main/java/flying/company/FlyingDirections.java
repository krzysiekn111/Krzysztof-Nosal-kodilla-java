package flying.company;

public class FlyingDirections {
    private String from;
    private String to;

    public FlyingDirections(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "FlyingDirections{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
