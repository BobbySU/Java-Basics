import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double rad = Double.parseDouble(scan.nextLine());
        Double degr = rad*180/Math.PI;
        System.out.printf("%.0f", degr);
    }
}
