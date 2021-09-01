import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a =Integer.parseInt(scan.nextLine());
        int b =Integer.parseInt(scan.nextLine());

        int cake = a*b;

        while (cake>0){
            String comand = scan.nextLine();
            if (comand.equals("STOP")){
                break;
            }
            int cakeLeft = Integer.parseInt(comand);
            cake-=cakeLeft;
        }

        if (cake>0){
            System.out.printf("%d pieces are left.",cake);
        }else {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(cake));
        }
    }
}
