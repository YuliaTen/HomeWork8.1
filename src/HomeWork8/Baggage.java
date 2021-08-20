package HomeWork8;

public class Baggage {
    String carrier;
    String classCarrier;
    int maxWeight;

    public Baggage(String carrier, String classCarrier, int maxWeight) {
        this.carrier = carrier;
        this.classCarrier = classCarrier;
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Baggage{" +
                "carrier='" + carrier + '\'' +
                ", classCarrier='" + classCarrier + '\'' +
                ", maxWeight=" + maxWeight +
                '}';
    }
}
