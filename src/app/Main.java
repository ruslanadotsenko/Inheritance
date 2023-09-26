package app;

import app.models.BaseWin;
import app.models.MaxWin;
import app.models.MiddleWin;
import app.models.MinWin;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static double deposit;
    public static int randomNumber;


    public static void main(String[] args) {

        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Please enter your deposit, USD: ");
        deposit = scanner.nextDouble();
        Random random = new Random();
        randomNumber = random.nextInt(10) + 1;
        System.out.println("Random number: " + randomNumber);
        scanner.close();

        BaseWin win;
        if (randomNumber < 3) {
            win = new MinWin(deposit);
        } else if (randomNumber >= 3 && randomNumber <= 7) {
            win = new MiddleWin(deposit);
        } else {
            win = new MaxWin(deposit);
        }

        System.out.printf("%nYour win in USD: %.2f%n", win.getWinAmount());
    }
}
