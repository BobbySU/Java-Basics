import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Inches = Double.parseDouble(scan.nextLine());
        double Centimeters = Inches*2.54;
        System.out.print(Centimeters);
    }
}
