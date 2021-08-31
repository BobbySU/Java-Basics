import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int First = Integer.parseInt(scan.nextLine());
        int Second = Integer.parseInt(scan.nextLine());
        int Third = Integer.parseInt(scan.nextLine());
        int Total = First+Second+Third;
        int min = Total/60;
        int sec = Total%60;
        System.out.printf("%d:%02d",min,sec );
    }
}

