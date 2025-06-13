package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

public class IceCreamApp2 {
    public static void main(String[] args) {
        // prijslijst, stock en ijsverkoper aanmaken
        PriceList priceList = new PriceList(0.75, 1.5, 2.5);
        Stock stock = new Stock(5, 10, 1, 5);
        IceCreamCar car = new IceCreamCar(priceList, stock);

        Eatable[] order = null;
        try {
            // bestellingen plaatsen
            order = new Eatable[]{
                    car.orderIceRocket(),                                                                                 // 1.5
                    car.orderIceRocket(),                                                                                 // 1.5
                    car.orderCone(new Cone.Flavor[]{Cone.Flavor.STRAWBERRY, Cone.Flavor.LEMON}),                          // 1.5
                    car.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.PISTACHE}),    // 2.25
                    car.orderMagnum(Magnum.MagnumType.ALPINENUTS)                                                         // 3.75 == 2.5 (standard prijs) * 1.5 (kef)
            };
        } catch (NoMoreIceCreamException e) {
            System.out.println(e.getMessage());
            order = new Eatable[0];          // voorkomt NullPointerException
        }

        // alles opeten
        for (Eatable e : order) {
            e.eat();
        }

        System.out.println("Totale profit: " + car.getProfit());

    }
}
