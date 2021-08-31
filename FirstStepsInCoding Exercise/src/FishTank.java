import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        double Procent = Double.parseDouble(scan.nextLine());

        double Total = ((a*b*c)*0.001)*(1-(Procent*0.01));

        System.out.printf("%.2f",Total);
    }
}
