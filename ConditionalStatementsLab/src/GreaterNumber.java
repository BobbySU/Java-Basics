import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());

        if (n1>n2) {
            System.out.println(n1);}
        else {
            System.out.println(n2);
        }
    }
}   