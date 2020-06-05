package intro.objects;

import java.util.Scanner;

public class Main {

    // to be used by main this variable must be static
    // declared outside the main function for use in other functions
    static Player[] players = new Player[5];
    static Scanner scnr = new Scanner(System.in);

    // to be used by main these methods must also be static

    // print the roster of all players
    public static void printRoster() {
        System.out.println("ROSTER");
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i+1) + " -- Jersey number: " + players[i].getJerseyNumber() + ", Rating: " + players[i].getRating());
        }
    }

    // returns a player given their jersey number
    public static Player getPlayerByNumber(int n) {
        int i = 0;
        // iterate the while loop until desired jersey number is found or array is exhausted
        while(players[i].getJerseyNumber() != n && i < players.length) {
            i++;
        }
        // i will be out of bounds if the number does not match, return a Player with negative values
        if (i >= players.length) { return new Player (-1, -1); }
        return players[i];
    }

    // print roster of only players above a certain rating
    public static void printBetterPlayersThan(int minRating) {
        for (int i = 0; i < players.length; i++) {
            // same loop as printRoster but conditions the print on whether it meets this condition
            if (players[i].getRating() > minRating) {
                System.out.println("Player " + (i+1) + " -- Jersey number: " + players[i].getJerseyNumber() + ", Rating: " + players[i].getRating());
            }
        }
    }

    // prompt the user to update the rating of a Player
    public static void updateRating() {
        Player p;
        System.out.print("Enter a jersey number: ");
        p = getPlayerByNumber(scnr.nextInt());  // get the Player with given jersey number

        if (p.getJerseyNumber() < 0 || p.getRating() < 0) { // account for user error, check if getPlayerByNumber gave negative values
            System.out.println("Sorry. There is no player with that jersey number.");
        }
        System.out.println("Enter a rating for the new player: ");
        p.setRating(scnr.nextInt());
    }

    // prompt the user to give a Player new values
    public static void replacePlayer() {
        Player p;
        System.out.print("Enter a jersey number: ");
        p = getPlayerByNumber(scnr.nextInt());

        if (p.getJerseyNumber() < 0 || p.getRating() < 0) {
            System.out.println("Sorry. There is no player with that jersey number.");
        }
        else {
            System.out.println("Enter a new jersey number: ");
            p.setJerseyNumber(scnr.nextInt());
            System.out.println("Enter a rating for the new player: ");
            p.setRating(scnr.nextInt());
        }
        menu(); // return the the user menu
    }


    // user menu
    public static void menu() {
        // print list of options
        System.out.println("MENU\n" +
                "    u - Update player rating\n" +
                "    a - Output players above a rating\n" +
                "    r - Replace player\n" +
                "    o - Output roster\n" +
                "    q - Quit");
        // parse a single char from input
        char option = scnr.next().toLowerCase().charAt(0);
        // handle defined set of options
        switch (option) {
            case 'u': updateRating();   // call a custom function to handle this request
                      break;
            case 'a': System.out.print("Enter a rating: ");
                      printBetterPlayersThan(scnr.nextInt());
                      break;
            case 'r': replacePlayer();
                      break;
            case 'o': printRoster();
                      break;
            case 'q': System.exit(0);   // end the program with no errors
                      break;
            // handle  input beyond the set
            default:  System.out.println("Sorry. Invalid input. Please try again:");
                      break;
        }

        // recursive function (i.e. calls itself)
        // in this case, an endless loop if the user never hits quit or causes an error
        menu();
    }

    // main function of a Java program is always static and always executes
    public static void main(String[] args) {
        // iterate players and prompt user to set each value
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
            System.out.println("Input jersey number for Player " + (i+1) + ":");
            players[i].setJerseyNumber(scnr.nextInt());
            System.out.println("Input rating for Player " + (i+1) + ":");
            players[i].setRating(scnr.nextInt());
        }

        // print the full roster first
        printRoster();

        // prompt the user for more activity
        menu();
    }
}