package intro.polymorphism;

public class Plant {
    protected String name;
    protected int price;
    protected boolean isFlower;

    public Plant() {
        name = "";
        price = 0;
        isFlower = false;
    }

    public Plant(String n, int p) {
        name = n;
        price = p;
        isFlower = false;
    }

    public void setName(String n) {
        name = n;
    }

    public void setPrice(int p) {
        price = p;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void printInfo() {
        System.out.println("Plant Information:" +
                "\nPlant name: " + name +
                "\nCost: " + price + "\n");
    }
}
