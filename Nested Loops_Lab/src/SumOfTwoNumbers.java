import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        int caunt=0;
        boolean magic =false;

        for (int i = a; i <=b ; i++) {
            for (int j = a; j <=b ; j++) {
                caunt++;
                if (i+j==m){
                    System.out.printf("Combination N:%d (%d + %d = %d)",caunt,i,j,m);
                    magic =true;
                    break;
                }
            }
            if (magic){
                break;
            }

        }
        if (!magic){
            System.out.printf("%d combinations - neither equals %d",caunt,m);
        }

    }
}
