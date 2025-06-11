package be.intecbrussel.eatables;

public class Test {
    public static void main(String[] args) {
        Eatable iceRocket = new IceRocket();
        iceRocket.eat();

        Eatable magnum = new Magnum();
        magnum.eat();

        Eatable cone = new Cone();
        cone.eat();
    }
}
