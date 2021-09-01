import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int caunt =0;

        for (int a = 0; a <=n ; a++) {
            for (int b = 0; b <=n ; b++) {
                for (int c = 0; c <=n ; c++) {
                    if (a+b+c==n){
                        caunt++;
                    }
                }
            }
        }
        System.out.println(caunt);
    }
}
