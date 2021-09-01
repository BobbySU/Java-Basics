import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double total = 0;

        if (city.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    total = quantity * 0.5;
                    System.out.printf("%.2f", total);
                    break;
                case "water":
                    total = quantity * 0.8;
                    System.out.printf("%.2f", total);
                    break;
                case "beer":
                    total = quantity * 1.2;
                    System.out.printf("%.2f", total);
                    break;
                case "sweets":
                    total = quantity * 1.45;
                    System.out.printf("%.2f", total);
                    break;
                case "peanuts":
                    total = quantity * 1.6;
                    System.out.printf("%.2f", total);
                    break;
            }
        } else if (city.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    total = quantity * 0.4;
                    System.out.printf("%.2f", total);
                    break;
                case "water":
                    total = quantity * 0.7;
                    System.out.printf("%.2f", total);
                    break;
                case "beer":
                    total = quantity * 1.15;
                    System.out.printf("%.2f", total);
                    break;
                case "sweets":
                    total = quantity * 1.3;
                    System.out.printf("%.2f", total);
                    break;
                case "peanuts":
                    total = quantity * 1.5;
                    System.out.printf("%.2f", total);
                    break;
            }
        }else if (city.equals("Varna")) {
            switch (product) {
                case "coffee":
                    total = quantity * 0.45;
                    System.out.printf("%.2f", total);
                    break;
                case "water":
                    total = quantity * 0.7;
                    System.out.printf("%.2f", total);
                    break;
                case "beer":
                    total = quantity * 1.1;
                    System.out.printf("%.2f", total);
                    break;
                case "sweets":
                    total = quantity * 1.35;
                    System.out.printf("%.2f", total);
                    break;
                case "peanuts":
                    total = quantity * 1.55;
                    System.out.printf("%.2f", total);
                    break;
            }
        }
    }
}

