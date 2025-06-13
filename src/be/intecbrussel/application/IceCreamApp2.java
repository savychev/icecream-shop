package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

import java.util.ArrayList;
import java.util.List;

public class IceCreamApp2 {
    public static void main(String[] args) {
        // prijslijst, stock en ijsverkoper aanmaken
        PriceList priceList = new PriceList(0.75, 1.5, 2.5);
        Stock stock = new Stock(5, 10, 1, 5);
        IceCreamCar car = new IceCreamCar(priceList, stock);

        List<Eatable> order = new ArrayList<>(); // een array met datatype <Eatable> aanmaken (bevat list van instanties van classes die Eetable implimintert

        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
