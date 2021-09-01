import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String  num= scan.nextLine();

        int min= Integer.MAX_VALUE;

        while (!num.equals("Stop")){
            int a =Integer.parseInt(num);
            if (a<min){
                min=a;
            }
            num=scan.nextLine();
        }
        System.out.println(min);
    }
}
