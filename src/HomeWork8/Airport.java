package HomeWork8;

import java.util.ArrayList;
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

        ComparatorWeigth cw = new ComparatorWeigth();
        baggages.sort(cw);

        System.out.println(baggages);



    }
}
