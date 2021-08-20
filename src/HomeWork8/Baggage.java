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

    public void doSomthing(){
        System.out.println("do it");
    }

    @Override
    public String toString() {
        return  "carrier='" + carrier + '\'' +
                ", classCarrier='" + classCarrier + '\'' +
                ", maxWeight=" + maxWeight + "\n";
    }
}
