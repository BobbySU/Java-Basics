import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double Pochivka = Double.parseDouble(scan.nextLine());
        int Pazel = Integer.parseInt(scan.nextLine());
        int Doll = Integer.parseInt(scan.nextLine());
        int Bear = Integer.parseInt(scan.nextLine());
        int Minon = Integer.parseInt(scan.nextLine());
        int Track = Integer.parseInt(scan.nextLine());

        Double SalePazel =Pazel*2.6;
        Double SaleDoll =Doll*3.00;
        Double SaleBear =Bear*4.1;
        Double SaleMinon =Minon*8.2;
        Double SaleTrack =Track*2.0;

        int TotalToys = Pazel+Doll+Bear+Minon+Track;

        Double TotalSale = SalePazel+SaleDoll+SaleBear+SaleMinon+SaleTrack;
        Double TotalSaleOff = TotalSale-(TotalSale*0.1);
        Double TotalSaleOff2 = TotalSale-(TotalSale*0.25);
        Double TotalSaleOff3 = TotalSaleOff2-(TotalSaleOff2*0.1);

        if (TotalToys<50) {
            if (TotalSaleOff>=Pochivka) {
                Double More = TotalSaleOff-Pochivka;
                System.out.printf("Yes! %.2f lv left.",More);
            }
            else {
                Double Less = Pochivka-TotalSaleOff;
                System.out.printf("Not enough money! %.2f lv needed.",Less);
            }
        }
        else {
            if (TotalSaleOff3>=Pochivka) {
                Double More = TotalSaleOff3-Pochivka;
                System.out.printf("Yes! %.2f lv left.",More);
            }
            else {
                Double Less = Pochivka-TotalSaleOff3;
                System.out.printf("Not enough money! %.2f lv needed.",Less);
            }
        }

    }
}
