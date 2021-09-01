import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String  num= scan.nextLine();

        int max= Integer.MIN_VALUE;

        while (!num.equals("Stop")){
            int a =Integer.parseInt(num);
            if (a>max){
                max=a;
            }
            num=scan.nextLine();
        }
        System.out.println(max);
    }
}
