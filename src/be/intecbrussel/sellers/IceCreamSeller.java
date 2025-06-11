package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;

public interface IceCreamSeller extends Profitable {
    IceRocket orderIceRocket();
    Cone orderCone(Flavor[] flavor);
}
