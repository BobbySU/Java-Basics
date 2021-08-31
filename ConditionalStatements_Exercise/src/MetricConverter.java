import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());
        String m1 = scan.nextLine();
        String m2 = scan.nextLine();
        double numTotal = 0;

        if (m1.equals("m")){
            if (m2.equals("mm")){
                numTotal = num*1000;
                System.out.printf("%.3f",numTotal);
            } else {
                numTotal = num*100;
                System.out.printf("%.3f",numTotal);
            }
        }else if (m1.equals("cm")){
            if (m2.equals("m")){
                numTotal = num/100;
                System.out.printf("%.3f",numTotal);
            }else {
                numTotal = num*10;
                System.out.printf("%.3f",numTotal);
            }
        }else {
            if (m2.equals("m")){
                numTotal = num/1000;
                System.out.printf("%.3f",numTotal);
            }else {
                numTotal = num/10;
                System.out.printf("%.3f",numTotal);
            }
        }
    }
}
