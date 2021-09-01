import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        if (budget <= 100) {
            switch (season) {
                case "summer":
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Camp - %.2f", budget * 0.3);
                    break;
                case "winter":
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel - %.2f", budget * 0.7);
                    break;
            }

        } else if (budget > 100 && budget <= 1000) {
            switch (season) {
                case "summer":
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Camp - %.2f", budget * 0.4);
                    break;
                case "winter":
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Hotel - %.2f", budget * 0.8);
                    break;
            }

        } else if (budget > 1000) {
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", budget * 0.9);

        }
    }
}
