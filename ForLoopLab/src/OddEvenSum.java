import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int odd=0;
        int even=0;

        int n =Integer.parseInt(scan.nextLine());
        for (int i = 0; i <n ; i++) {
            int num =Integer.parseInt(scan.nextLine());
            if (i%2==0){
                odd+=num;
            }else {
                even+=num;
            }
        }
        if (odd==even){
            System.out.println("Yes");
            System.out.println("Sum = " + odd);
        }else {
            System.out.println("No");
            System.out.printf("Diff = " + Math.abs(odd-even));
        }
    }
}
