import java.util.Scanner;

public class Travelling {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();
        while (!destination.equals("End")) {
            double price = Double.parseDouble(scan.nextLine());
            double save = 0;
            while (save < price) {
                double money = Double.parseDouble(scan.nextLine());
                save += money;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scan.nextLine();
        }
    }
}

