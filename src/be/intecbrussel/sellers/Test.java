package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class Test {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(1.5, 2.0, 2.5);
        IceCreamSeller salon = new IceCreamSalon(priceList);


        IceRocket rocket1 = salon.orderIceRocket();
        IceRocket rocket2 = salon.orderIceRocket();
        rocket1.eat();                                              // +2
        rocket2.eat();                                              // +2
        System.out.println("Totale profit: " + salon.getProfit());  // 4


        Cone.Flavor[] flavors = {Cone.Flavor.VANILLA, Cone.Flavor.BANANA};
        Cone cone = salon.orderCone(flavors);
        cone.eat();                                                 // +3 (twee balletjes)
        System.out.println("Totale profit: " + salon.getProfit());  // 7

        Magnum magnum1 = salon.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE);
        magnum1.eat();                                              // +2.5 (standarte prijs)
        System.out.println("Totale profit: " + salon.getProfit());  // 9.5

        Magnum magnum2 = salon.orderMagnum(Magnum.MagnumType.ALPINENUTS);
        magnum2.eat();                                              // +3.75 (2.5 * 1.5 (kef))
        System.out.println("Totale profit: " + salon.getProfit());  // 13.25

        Magnum magnum3 = salon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
        magnum3.eat();                                              // +5 (2.5 * 2 (kef))
        System.out.println("Totale profit: " + salon.getProfit());  // 18.25


    }
}
