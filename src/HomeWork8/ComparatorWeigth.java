package HomeWork8;

import java.util.Comparator;

public class ComparatorWeigth implements Comparator<Baggage> {
    @Override
    public int compare(Baggage o1, Baggage o2) {
        return o1.maxWeight-o2.maxWeight;
    }
}
