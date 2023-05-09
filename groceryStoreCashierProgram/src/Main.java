import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define the prices of each item
        double priceOfPear = 2.14;
        double priceOfApple = 3.67;
        double priceOfTomato = 1.11;
        double priceOfBanana = 0.95;
        double priceOfAubergine = 5.0;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the weight of each item
        System.out.print("Armut kaç kilo? ");
        int pear = scanner.nextInt();

        System.out.print("Elma kaç kilo? ");
        int apple = scanner.nextInt();

        System.out.print("Domates kaç kilo? ");
        int tomato = scanner.nextInt();

        System.out.print("Muz kaç kilo? ");
        int banana = scanner.nextInt();

        System.out.print("Patlıcan kaç kilo? ");
        int aubergine = scanner.nextInt();

        // Calculate the total price based on the input
        double totalPrice = (priceOfPear * pear) + (priceOfApple * apple) + (priceOfTomato * tomato)
                + (priceOfBanana * banana) + (priceOfAubergine * aubergine);

        // Display the total price to the user
        System.out.println("Toplam tutar: " + totalPrice + " TL");
    }
}
