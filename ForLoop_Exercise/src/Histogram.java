import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(scan.nextLine());
            if (a < 200) {
                p1++;
            } else if (a >= 200 && a < 400) {
                p2++;
            } else if (a >= 400 && a < 600) {
                p3++;
            } else if (a >= 600 && a < 800) {
                p4++;
            } else if (a >= 800) {
                p5++;
            }
        }
        p1=p1/n*100;
        p2=p2/n*100;
        p3=p3/n*100;
        p4=p4/n*100;
        p5=p5/n*100;
        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
        System.out.printf("%.2f%%%n",p4);
        System.out.printf("%.2f%%%n",p5);

    }
}
