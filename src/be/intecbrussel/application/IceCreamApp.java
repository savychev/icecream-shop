package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        // prijslijst maken
        PriceList priceList = new PriceList(0.75, 1.5, 2.5);

        // verkoper (salon) maken
        IceCreamSalon salon = new IceCreamSalon(priceList);

        // bestellingen plaatsen
        Eatable[] order = new Eatable[] {
                salon.orderIceRocket(),                                                                                 // 1.5
                salon.orderIceRocket(),                                                                                 // 1.5
                salon.orderCone(new Cone.Flavor[]{Cone.Flavor.STRAWBERRY, Cone.Flavor.LEMON}),                          // 1.5
                salon.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.PISTACHE}),    // 2.25
                salon.orderMagnum(Magnum.MagnumType.ALPINENUTS)                                                         // 3.75 == 2.5 (standard prijs) * 1.5 (kef)
        };

        // alles opeten
        for (Eatable e : order) {
            e.eat();
        }

        System.out.println("Totale profit: " + salon.getProfit());
    }
}
