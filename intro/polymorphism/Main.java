package intro.polymorphism;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	ArrayList<Plant> plants = new ArrayList<Plant>();

	plants.add(new Plant("Spirea", 10));
	plants.add(new Flower("Hydrangea", 30, false, "lilac"));
	plants.add(new Flower("Rose", 6, false, "white"));
	plants.add(new Plant("Mint", 4));
	for (int i = 0; i < plants.size(); i++) {
		plants.get(i).printInfo();
	}

    }
}
