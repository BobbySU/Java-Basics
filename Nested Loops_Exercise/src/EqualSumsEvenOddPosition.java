import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int a= Integer.parseInt(scan.nextLine());
        int b= Integer.parseInt(scan.nextLine());

        for (int i = a; i <=b ; i++) {
            int odd =0;
            int evan =0;
            String num = ""+i;
            for (int j = 0; j <num.length(); j++) {
                int current = Integer.parseInt("" +num.charAt(j));
                if (j%2==0){
                    evan+=current;
                }else {
                    odd+=current;
                }
            }
            if (evan==odd){
                System.out.print(i+" ");
            }
        }
    }
}
