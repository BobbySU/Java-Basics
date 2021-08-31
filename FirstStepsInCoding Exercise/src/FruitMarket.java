import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double PeiceStrowbarry = Double.parseDouble(scan.nextLine());
        double Bannana = Double.parseDouble(scan.nextLine());
        double Oringe = Double.parseDouble(scan.nextLine());
        double Rosbarry = Double.parseDouble(scan.nextLine());
        double Strawbarry = Double.parseDouble(scan.nextLine());

        double PeiceRosbarry = PeiceStrowbarry*0.5;
        double PeiceBannana = PeiceRosbarry-(PeiceRosbarry*0.8);
        double PeiceOrange = PeiceRosbarry-(PeiceRosbarry*0.4);

        double Total = (Bannana*PeiceBannana+Oringe*PeiceOrange+Rosbarry*PeiceRosbarry+Strawbarry*PeiceStrowbarry);

        System.out.printf("%.2f",Total);
    }
}
