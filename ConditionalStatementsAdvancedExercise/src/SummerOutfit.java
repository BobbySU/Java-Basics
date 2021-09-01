import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int t = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();

        String outfit="";
        String shoes="";

        if (t>=10&&t<=18){
            switch (day){
                case "Morning":
                    outfit="Sweatshirt";
                    shoes="Sneakers";
                    System.out.printf("It's %d degrees, get your %s and %s.",t,outfit,shoes);
                    break;
                case "Afternoon":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.",t,outfit,shoes);
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.",t,outfit,shoes);
                    break;
            }

        }else if (t>18&&t<=24){
            switch (day){
                case "Morning":
                    outfit="Shirt";
                    shoes="Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.",t,outfit,shoes);
                    break;
                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    System.out.printf("It's %d degrees, get your %s and %s.",t,outfit,shoes);
                    break;
                case "Evening":
                    outfit="Shirt";
                    shoes="Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.",t,outfit,shoes);
                    break;
            }

        }else if (t>=25){
            switch (day){
                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    System.out.printf("It's %d degrees, get your %s and %s.",t,outfit,shoes);
                    break;
                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    System.out.printf("It's %d degrees, get your %s and %s.",t,outfit,shoes);
                    break;
                case "Evening":
                    outfit="Shirt";
                    shoes="Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.",t,outfit,shoes);
                    break;
            }

        }
    }
}
