import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        int p = Integer.parseInt(scan.nextLine());

        int gift = 0;
        int money = 0;
        int brother=0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                money += i/2*10;
                brother+=1;
            } else {
                gift += 1;
            }
        }
        money= money-brother;
        money= money+(p*gift);
        if(money>=price){
            System.out.print("Yes! ");
            System.out.printf("%.2f",Math.abs(money-price));
        }else {
            System.out.print("No! ");
            System.out.printf("%.2f",Math.abs(money-price));
        }
    }
}
