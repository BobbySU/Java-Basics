import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double Dep = Double.parseDouble(scan.nextLine());
        int Month = Integer.parseInt(scan.nextLine());
        Double Procent1 = Double.parseDouble(scan.nextLine());
        Double Procent2 = Procent1/100;
        Double Total = ((Dep*Procent2/12)*Month)+Dep;
        System.out.println(Total);
    }
}
