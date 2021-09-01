import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scan.nextLine());
            if (a % 2 == 0) {
                p1++;}
            if (a % 3 == 0) {
                p2++;}
            if (a % 4 == 0) {
                p3++;
            }
        }
        p1=p1/n*100;
        p2=p2/n*100;
        p3=p3/n*100;
        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
    }
}
