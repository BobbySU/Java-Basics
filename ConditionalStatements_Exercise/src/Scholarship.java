import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dohod = Double.parseDouble(scan.nextLine());
        double srUspeh = Double.parseDouble(scan.nextLine());
        double minSalary = Double.parseDouble(scan.nextLine());

        double soc = minSalary * 0.35;
        double exel = srUspeh * 25;

        if (dohod >= minSalary) {
            if (srUspeh < 5.5) {
                System.out.println("You cannot get a scholarship!");
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", exel);
            }}

        if (dohod < minSalary) {
            if (srUspeh < 4.5) {
                System.out.println("You cannot get a scholarship!");
            } else if(srUspeh<5.5) {
                System.out.printf("You get a Social scholarship %.0f BGN", soc);
            } else if (exel >= soc ) {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", exel);
                } else {
                    System.out.printf("You get a Social scholarship %.0f BGN", soc);
                }

            }

        }
    }

