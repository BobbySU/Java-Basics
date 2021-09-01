import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String type = scan.nextLine();
        int r = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        double total =0;

        switch (type){
            case "Premiere":
                total=r*c*12;
                System.out.printf("%.2f leva",total);
                break;
            case "Normal":
                total=r*c*7.5;
                System.out.printf("%.2f leva",total);
                break;
            case "Discount":
                total=r*c*5;
                System.out.printf("%.2f leva",total);
                break;
        }
    }
}
