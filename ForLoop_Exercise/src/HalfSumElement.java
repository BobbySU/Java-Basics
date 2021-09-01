import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(scan.nextLine());
            sum += a;

            if (a > max) {
                max = a;
            }
        }
        int sumMax = sum - max;
        if (sumMax == max) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sumMax - max));
        }
    }
}
