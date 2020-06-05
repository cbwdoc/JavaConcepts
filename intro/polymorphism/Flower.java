package intro.polymorphism;

public class Flower extends Plant {
    private boolean isAnnual;
    private String color;

    public Flower(String n, int p, boolean a, String c) {
        name = n;
        price = p;
        isFlower = true;
        isAnnual = a;
        color = c;
    }

    public void setIsAnnual(boolean b) {
        isAnnual = b;
    }

    public void setColor(String c) {
        color = c;
    }

    public boolean isAnnual() {
        return isAnnual;
    }

    public String getColor() {
        return color;
    }

    public void printInfo() {
        System.out.println("Plant Information:" +
                "\nPlant name: " + name +
                "\nCost: " + price +
                "\nAnnual: " + isAnnual +
                "\nColor of Flowers: " + color + "\n");
    }
}
