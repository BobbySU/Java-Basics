import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String u = scan.nextLine();
        String p = scan.nextLine();

        String text = scan.nextLine();
        while (!text.equals(p)) {
            text = scan.nextLine();
        }
        System.out.printf("Welcome %s!", u);
    }

}

