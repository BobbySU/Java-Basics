import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int e = Integer.parseInt(scan.nextLine());
        int a = Integer.parseInt(scan.nextLine());

        for (int i = e; i >= 1; i--) {
            for (int j = 0; j < a; j++) {
                if (i == e) {
                    System.out.printf("L%d%d ", i, j);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                } else {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.println();
        }
    }
}
