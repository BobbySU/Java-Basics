import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double holiday = Double.parseDouble(scan.nextLine());
        double money = Double.parseDouble(scan.nextLine());

        int day = 0;
        int spendDay = 0;

        while (money<holiday&&spendDay<5){
            String spendSave = scan.nextLine();
            double moneyDay = Double.parseDouble(scan.nextLine());
            day++;

            if (spendSave.equals("spend")){
                money -= moneyDay;
                spendDay++;
                if (money<0){
                    money=0;
                }
            }
            if (spendSave.equals("save")){
                money+=moneyDay;
                spendDay=0;
            }
        }

        if (spendDay==5) {
            System.out.printf("You can't save the money.%n%d", day);
        }
        if (money>=holiday) {
            System.out.printf("You saved the money for %d days.",day);
        }
    }
}
