package lab3;

public abstract class Fruit {
    public double weight;
    private double sugar;
    private double water;
    private Color color;

    public Fruit(double weight, double sugar, double water, Color color) {
        this.weight = weight;
        this.sugar = sugar;
        this.water = water;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", sugar=" + sugar +
                ", water=" + water +
                ", color=" + color +
                '}';
    }
}