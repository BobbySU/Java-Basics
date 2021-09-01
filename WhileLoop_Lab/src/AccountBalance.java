import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String income = scan.nextLine();
        double total =0;

        while (!income.equals("NoMoreMoney")){
            double in =Double.parseDouble(income);
            if (in<0){
                System.out.println("Invalid operation!");
                break;
            }
            total+=in;
            System.out.printf("Increase: %.2f%n",in);
            income=scan.nextLine();
        }
        System.out.printf("Total: %.2f",total);
    }
}
