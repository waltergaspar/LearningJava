package Principal;

import Application.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dollar price: ");
        CurrencyConverter.price = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.quantity = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.paidPrice());
    }
}