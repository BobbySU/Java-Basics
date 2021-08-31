import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double buget = Double.parseDouble(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        double clod = Double.parseDouble(scan.nextLine());

        double dekor = buget*0.1;
        double peopleClod = people*clod;


        if (people>=150) {
            peopleClod= people*clod*0.9;
        }

        double Total = buget-dekor-peopleClod;
        double Total2= Math.abs(Total);

        if (Total>=0) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",Total2);

        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",Total2);
        }

    }
}
