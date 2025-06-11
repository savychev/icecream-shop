package be.intecbrussel.eatables;

public class Cone implements Eatable {

    public enum Flavor {
        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE
    }

    private Flavor[] balls;

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.print("Eating a cone with: ");
        try {
            for (Flavor flavor : balls) {
                System.out.print(flavor + " ");
            }
        } catch (NullPointerException e) {
            System.err.println("Array 'balls' is empty\n" + e.getMessage());
        }

    }

    public Flavor[] getBalls() {
        return balls;
    }
}
