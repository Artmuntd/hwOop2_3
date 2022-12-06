package Transport;

public enum Weight {
    N1 (0D, 3.5),
    N2(3.6, 12D ),
    N3(12.1, null);
    private final Double from;
    private final Double to;

    Weight(Double from, Double to) {
        this.from = from;
        this.to = to;
    }

    public Double getFrom() {
        return from;
    }

    public Double getTo() {
        return to;
    }
}
