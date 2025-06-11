package be.intecbrussel.sellers;

public class PriceList {
    double ballPrice;	        // de prijs van een bolletje voor Cone
    double rocketPrice;	        // de prijs van IceRocket
    double magnumStandardPrice;	// het basis prijs van Magnum

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

//    De getmagnumprice methode zal aan de hand van een gegeven MagnumType en een algemeen
//    opgegeven magnumStandardPrice teruggeven wat de prijs van zo’n magnum zal zijn.
//    Bv: Een alpinenuts magnum zal 1.5 keer de prijs zijn van een standaard magnum.
    public double getMagnumPrice() {
        return magnumStandardPrice;
        //return magnumStandardPrice * coefficient;
    }
}
