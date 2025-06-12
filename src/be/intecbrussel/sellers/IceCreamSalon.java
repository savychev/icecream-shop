package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller {

    private PriceList priceList;                    // object van PriceList
    private double totalProfit;

    public IceCreamSalon(PriceList priceList) {     // constructor krijgt object van PriceList
        this.priceList = priceList;
    }

    @Override
    public double getProfit() {
        return 0;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        Cone cone = new Cone(flavors);                              // nieuwe object van Cone aanmaken

        double cost = flavors.length * priceList.getBallPrice();    // bereken de prijs van één ijsje (aantal ball * price)
        totalProfit += cost;                                        // tel de totale profit

        return cone;                                                // return nieuwe object van Cone
    }

    @Override
    public IceRocket orderIceRocket() {
        return null;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        return null;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
