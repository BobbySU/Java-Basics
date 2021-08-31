import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Dog = Integer.parseInt(scan.nextLine());
        int Cat = Integer.parseInt(scan.nextLine());
        double Food1 = 2.5;
        int Food2 = 4;
        Double Price = Dog*Food1+Cat*Food2;
        System.out.printf("%s lv.",Price);
    }
}
