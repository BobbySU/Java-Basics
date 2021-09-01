import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double total=0;

        if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")){
            switch (fruit){
                case "banana":
                    total=quantity*2.5;
                    System.out.printf("%.2f",total);
                    break;
                case "apple":
                    total=quantity*1.2;
                    System.out.printf("%.2f",total);
                    break;
                case "orange":
                    total=quantity*0.85;
                    System.out.printf("%.2f",total);
                    break;
                case "grapefruit":
                    total=quantity*1.45;
                    System.out.printf("%.2f",total);
                    break;
                case "kiwi":
                    total=quantity*2.7;
                    System.out.printf("%.2f",total);
                    break;
                case "pineapple":
                    total=quantity*5.5;
                    System.out.printf("%.2f",total);
                    break;
                case "grapes":
                    total=quantity*3.85;
                    System.out.printf("%.2f",total);
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        }else if (day.equals("Saturday")||day.equals("Sunday")){
            switch (fruit){
                case "banana":
                    total=quantity*2.7;
                    System.out.printf("%.2f",total);
                    break;
                case "apple":
                    total=quantity*1.25;
                    System.out.printf("%.2f",total);
                    break;
                case "orange":
                    total=quantity*0.9;
                    System.out.printf("%.2f",total);
                    break;
                case "grapefruit":
                    total=quantity*1.6;
                    System.out.printf("%.2f",total);
                    break;
                case "kiwi":
                    total=quantity*3;
                    System.out.printf("%.2f",total);
                    break;
                case "pineapple":
                    total=quantity*5.6;
                    System.out.printf("%.2f",total);
                    break;
                case "grapes":
                    total=quantity*4.2;
                    System.out.printf("%.2f",total);
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        }else {
            System.out.println("error");
        }

    }
}

