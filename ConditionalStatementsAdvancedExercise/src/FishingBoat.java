import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season =scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());

        double price = 0;

        switch (season){
            case "Spring":
                price=3000;
                break;
            case "Summer":
            case "Autumn":
                price=4200;
                break;
            case "Winter":
                price=2600;
                break;
        }

        if (number<=6){
            price=price*0.9;
        }else if (number>6&&number<=11){
            price=price*0.85;
        }else if (number>=12){
            price=price*0.75;
        }

        if (number%2==0!=season.equals("Autumn")){
            price=price*0.95;
        }

        if (budget>=price){
            System.out.printf("Yes! You have %.2f leva left.",Math.abs(budget-price));
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",Math.abs(budget-price));
        }
    }
}
