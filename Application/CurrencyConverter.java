package Application;

public class CurrencyConverter {
    public static double price, quantity;
    public static final double tax = 1.06;
    public static double paidPrice(){
        return (price * quantity) * tax;
    }


}
