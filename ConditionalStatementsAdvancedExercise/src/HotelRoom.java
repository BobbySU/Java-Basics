import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String month = scan.nextLine();
        int day = Integer.parseInt(scan.nextLine());

        double Apartment = 0;
        double Studio = 0;

        switch (month){
            case "May":
            case "October":
                if (day>14) {
                    Apartment=day*65*0.9;
                    System.out.printf("Apartment: %.2f lv.%n",Apartment);
                }else {
                    Apartment=day*65;
                    System.out.printf("Apartment: %.2f lv.%n",Apartment);
                }
                if (day>14){
                    Studio=day*50*0.7;
                    System.out.printf("Studio: %.2f lv.",Studio);
                }else if (day>7&&day<=14){
                    Studio=day*50*0.95;
                    System.out.printf("Studio: %.2f lv.",Studio);
                }else {
                    Studio=day*50;
                    System.out.printf("Studio: %.2f lv.",Studio);
                }

                break;
            case "June":
            case "September":
                if (day>14) {
                    Apartment=day*68.7*0.9;
                    Studio=day*75.2*0.8;
                    System.out.printf("Apartment: %.2f lv.%n",Apartment);
                    System.out.printf("Studio: %.2f lv.",Studio);
                }else {
                    Apartment=day*68.7;
                    Studio=day*75.2;
                    System.out.printf("Apartment: %.2f lv.%n",Apartment);
                    System.out.printf("Studio: %.2f lv.",Studio);
                }
                break;
            case "July":
            case "August":
                if (day>14) {
                    Apartment=day*77*0.9;
                    System.out.printf("Apartment: %.2f lv.%n",Apartment);
                }else {
                    Apartment=day*77;
                    System.out.printf("Apartment: %.2f lv.%n",Apartment);
                }
                Studio=day*76;
                System.out.printf("Studio: %.2f lv.",Studio);
                break;
        }
                //May, June, July, August, September или October
    }
}
