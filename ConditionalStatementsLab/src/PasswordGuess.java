import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String n = scan.nextLine();
        String pass = "s3cr3t!P@ssw0rd";

        if (n.equals(pass)) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }
    }
}
