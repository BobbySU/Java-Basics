import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double oddMin=Integer.MAX_VALUE;
        double oddMax=Integer.MIN_VALUE;
        double oddsum=0;
        double evenMix=Integer.MAX_VALUE;
        double evenMax=Integer.MIN_VALUE;
        double evensum=0;

        for (int i = 1; i <= n ; i++) {
            double a =Double.parseDouble(scan.nextLine());
            if (i%2==0){
                evensum+=a;
                if(a>evenMax){
                    evenMax=a;
                }
                if (a<evenMix){
                    evenMix=a;
                }
            }else {
                oddsum+=a;
                if (a>oddMax){
                    oddMax=a;
                }
                if (a<oddMin){
                    oddMin=a;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n",oddsum);
        if (oddMin==Integer.MAX_VALUE){
            System.out.println("OddMin=No,");
        }else {
        System.out.printf("OddMin=%.2f,%n",oddMin);
        }
        if (oddMax==Integer.MIN_VALUE){
            System.out.println("OddMax=No,");
        }else {
        System.out.printf("OddMax=%.2f,%n",oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n",evensum);
        if (evenMix==Integer.MAX_VALUE){
            System.out.println("EvenMin=No,");
        }else {
        System.out.printf("EvenMin=%.2f,%n",evenMix);
        }
        if (evenMax==Integer.MIN_VALUE){
            System.out.println("EvenMax=No");
        }else {
        System.out.printf("EvenMax=%.2f%n",evenMax);
        }
    }
}
