import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Day = Integer.parseInt(scan.nextLine());
        int Sheff = Integer.parseInt(scan.nextLine());
        int Cake = Integer.parseInt(scan.nextLine());
        int Gofret = Integer.parseInt(scan.nextLine());
        int Pancake = Integer.parseInt(scan.nextLine());

        int PriceCake = Cake*45;
        double PriceGofret = Gofret*5.8;
        double PricePancake= Pancake*3.2;

        double Total =(((PriceCake+PriceGofret+PricePancake)*Sheff)*Day);
        double TotalOff =Total-Total/8;

        System.out.printf("%.2f",TotalOff);
    }
}
