import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Hall = Integer.parseInt(scan.nextLine());

        double Cack = Hall*0.2;
        double Drinks = Cack-(Cack*0.45);
        double Animator = Hall*1/3;
        double total = Hall+Cack+Drinks+Animator;

        System.out.println(total);
    }
}
