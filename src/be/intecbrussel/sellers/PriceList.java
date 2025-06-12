package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {
    private double ballPrice;            // de prijs van een bolletje voor Cone
    private double rocketPrice;            // de prijs van IceRocket
    private double magnumStandardPrice;    // het basis prijs van Magnum

    public PriceList() {
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType type) {
        switch (type) {
            case ALPINENUTS -> {
                return magnumStandardPrice * 1.5;
            }
            case ROMANTICSTRAWBERRIES -> {
                return magnumStandardPrice * 2;
            }
            default -> {
                return magnumStandardPrice;
            }
        }

    }
}
