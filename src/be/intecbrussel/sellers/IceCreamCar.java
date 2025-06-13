package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller{
    private PriceList priceList;
    private Stock stock;
    private double totalProfit = 0.0;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        return null;
    }

    public Cone prepareCone(Cone.Flavor[] flavors) {
        return null;
    }

    @Override
    public IceRocket orderIceRocket() {
        return null;
    }

    public IceRocket prepareIceRocket() {
        return null;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        return null;
    }

    public Magnum prepareMagnum(Magnum.MagnumType type) {
        return null;
    }

    @Override
    public double getProfit() {
        return 0;
    }
}
