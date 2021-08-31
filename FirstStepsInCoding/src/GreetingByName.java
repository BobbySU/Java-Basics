import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        System.out.printf("Hello, %s!",Name);
    }
}