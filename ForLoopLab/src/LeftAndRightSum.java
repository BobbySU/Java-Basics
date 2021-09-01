import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int first=0;
        int second=0;

        int n =Integer.parseInt(scan.nextLine());
        for (int i = 0; i <(2*n) ; i++) {
            int num =Integer.parseInt(scan.nextLine());
            if(i<n){
                first+=num;
            }else {
                second+=num;
            }
        }
        if (first==second){
            System.out.println("Yes, sum = " + first);
        }else {
            System.out.println("No, diff = " + Math.abs(first-second));
        }
    }
}
