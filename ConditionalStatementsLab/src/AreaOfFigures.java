import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String f = scan.nextLine();

        if (f.equals("square")) {
            Double a = Double.parseDouble(scan.nextLine());
            Double Total = a*a;
            System.out.printf("%.3f",Total);
        }
        if (f.equals("rectangle")) {
            Double a = Double.parseDouble(scan.nextLine());
            Double b = Double.parseDouble(scan.nextLine());
            Double Total = a*b;
            System.out.printf("%.3f",Total);
        }
        if (f.equals("circle")) {
            Double r = Double.parseDouble(scan.nextLine());
            Double Total = r*r*Math.PI;
            System.out.printf("%.3f",Total);
        }
        if (f.equals("triangle")) {
            Double a = Double.parseDouble(scan.nextLine());
            Double ha = Double.parseDouble(scan.nextLine());
            Double Total = (a*ha)/2;
            System.out.printf("%.3f",Total);
        }
    }
}
