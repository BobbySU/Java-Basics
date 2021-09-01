import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1 = Double.parseDouble(scan.nextLine());
        double n2 = Double.parseDouble(scan.nextLine());
        String marc = scan.nextLine();

        double total = 0;

        if (n2 != 0) {
            if (marc.equals("+") || marc.equals("-") || marc.equals("*")) {
                switch (marc) {
                    case "+":
                        total = n1 + n2;
                        System.out.printf("%.0f + %.0f = %.0f -", n1, n2, total);
                        break;
                    case "-":
                        total = n1 - n2;
                        System.out.printf("%.0f - %.0f = %.0f -", n1, n2, total);
                        break;
                    case "*":
                        total = n1 * n2;
                        System.out.printf("%.0f * %.0f = %.0f -", n1, n2, total);
                        break;
                }
                if (total % 2 == 0) {
                    System.out.println(" even");
                } else {
                    System.out.println(" odd");
                }

            } else if (marc.equals("/")) {
                total = n1 / n2;
                System.out.printf("%.0f / %.0f = %.2f", n1, n2, total);

            } else if (marc.equals("%")) {
                total = n1 % n2;
                System.out.printf("%.0f %% %.0f = %.0f", n1, n2, total);
            }
        } else if (n2 == 0) {
            System.out.printf("Cannot divide %.0f by zero", n1);
        }
    }
}
