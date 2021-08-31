import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double Dvor = scan.nextDouble();
        Double Price = 7.61;
        Double Off = 0.18;
        Double OffTotal = Dvor*Price*Off;
        Double PriceTotal = Dvor*Price-OffTotal;
        System.out.printf("The final price is: %s lv.",PriceTotal);
        System.out.println();
        System.out.printf("The discount is: %s lv.",OffTotal);
    }
}
