package be.intecbrussel.sellers;

public class Stock {
    private int cones;
    private int balls;
    private int rockets;
    private int magnums;

    public Stock(int cones, int balls, int rockets, int magnums) {
        this.cones = cones;
        this.balls = balls;
        this.rockets = rockets;
        this.magnums = magnums;
    }

    public int getCones() {
        return cones;
    }

    public int getBalls() {
        return balls;
    }

    public int getRockets() {
        return rockets;
    }

    public int getMagnums() {
        return magnums;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public void setRockets(int rockets) {
        this.rockets = rockets;
    }

    public void setMagnums(int magnums) {
        this.magnums = magnums;
    }

    public void takeCones(int amount) {
        cones -= amount;
    }
    public void takeBalls(int amount) {
        balls -= amount;
    }
    public void takeRockets(int amount) {
        rockets -= amount;
    }
    public void takeMagnums(int amount) {
        magnums -= amount;
    }


}
