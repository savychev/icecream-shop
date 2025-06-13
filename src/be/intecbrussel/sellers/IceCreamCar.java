package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {
    private final PriceList priceList;
    private final Stock stock;
    private double totalProfit = 0.0;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        if (stock.getCones() < 1 || stock.getBalls() < flavors.length) {    // controle op de bechikbaarheid van hoorntjes en ijsbollen
            throw new NoMoreIceCreamException("Er zijn geen hoorntjes meer beschikbaar.");
        }
        return prepareCone(flavors);                                        // prepare-methode aanroepen
    }

    public Cone prepareCone(Cone.Flavor[] flavors) {
        stock.takeCones(1);
        stock.takeBalls(flavors.length);
        return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {
        if (stock.getRockets() < 1) {
            throw new NoMoreIceCreamException("No more ice rockets available");
        }

        double rocketPrice = priceList.getRocketPrice();
        totalProfit += rocketPrice;

        return prepareIceRocket();
    }

    public IceRocket prepareIceRocket() {
        stock.takeRockets(1);
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        if (stock.getMagnums() < 1) {
            throw new NoMoreIceCreamException("No more magnums available");
        }

        double magnumPrice = priceList.getMagnumPrice(type);
        totalProfit += magnumPrice;

        return prepareMagnum(type);
    }

    public Magnum prepareMagnum(Magnum.MagnumType type) {
        stock.takeMagnums(1);
        return new Magnum(type);
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }
}
