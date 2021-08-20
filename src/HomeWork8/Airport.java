package HomeWork8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Airport {

    public static void main(String[] args) {

        List<Baggage> baggages = new ArrayList<>();
        baggages.add(new Baggage("S7","первый",30));
        baggages.add(new Baggage("Fly","'эконом'",10));
        baggages.add(new Baggage("Aeroflot","комфорт",50));
        baggages.add(new Baggage("Fly","комфорт",50));
        baggages.add(new Baggage("Sky","первый",30));
        baggages.add(new Baggage("S7","комфорт",50));
        baggages.add(new Baggage("Aeroflot","эконом",10));

        System.out.println("Сортировка максимальному весу");
        Comparator<Baggage> cw = (o1, o2) -> o1.maxWeight-o2.maxWeight;
        baggages.sort(cw);
        System.out.println(baggages);

        System.out.println("\n Сортировка по длине Компании и класса");
        Comparator<Baggage> comparatorDlStr = new Comparator<Baggage>(){
            @Override
            public int compare(Baggage o1, Baggage o2) {
                String str1 = o1.carrier+" "+o1.classCarrier;
                String str2 = o2.carrier+" "+o2.classCarrier;
                return str1.length()-str2.length();
            }
        };
        baggages.sort(comparatorDlStr);
        System.out.println(baggages);

    }
}
