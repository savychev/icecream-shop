package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller {

    private final PriceList priceList;                    // object van PriceList
    private double totalProfit = 0.0;

    public IceCreamSalon(PriceList priceList) {     // constructor krijgt object van PriceList
        this.priceList = priceList;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        Cone cone = new Cone(flavors);                              // nieuwe object van Cone aanmaken

        double pricePerBall = priceList.getBallPrice();             // de prijs per bal krijgen
        totalProfit += flavors.length * pricePerBall;               // de prijs van hele ijsje berekenen (aantal ball * price) en resultaat toevoegen in totale profit

        return cone;                                                // nieuwe object van Cone teruggeven
    }

    @Override
    public IceRocket orderIceRocket() {
        double rocketPrice = priceList.getRocketPrice();            // de prijs krijgen
        totalProfit += rocketPrice;                                 // de prijs van rocketje in totale profit toevoegen

        return new IceRocket();                                     // nieuwe object aanmaken en teruggeven
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        double magnumPrice = priceList.getMagnumPrice(type);        // de prijs krijgen
        totalProfit += magnumPrice;                                 // de prijs van magnumtje in totale profit toevoegen

        return new Magnum(type);                                    // nieuwe object aanmaken en teruggeven
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
