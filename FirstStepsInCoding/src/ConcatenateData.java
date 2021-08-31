import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        int Age = Integer.parseInt(scan.nextLine());
        String Town = scan.nextLine();
        System.out.printf("You are %s %s, a %s-years old person from %s.",name1,name2,Age,Town);
    }
}
