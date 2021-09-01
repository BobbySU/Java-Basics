import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();
        int sumP = 0;
        int sumNP = 0;

        while (!num.equals("stop")) {
            int n = Integer.parseInt(num);
            boolean p = true;
            if (n < 0) {
                System.out.println("Number is negative.");
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        p = false;
                        break;
                    }
                }
                if (p) {
                    sumP += n;
                } else {
                    sumNP += n;
                }
            }
            num = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumP);
        System.out.printf("Sum of all non prime numbers is: %d", sumNP);
    }
}
