import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int count=1;
        boolean flag =false;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (count>n){
                flag=true;
                break;
                }
                System.out.print(count+" ");
                count++;
            }
            if (flag){
                break;
            }
            System.out.println();
        }
    }
}
