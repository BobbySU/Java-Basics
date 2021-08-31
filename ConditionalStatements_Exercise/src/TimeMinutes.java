import java.util.Scanner;

public class TimeMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int Titalm = h*60+m+15;
        int Newh = Titalm/60;
        int Newm = Titalm%60;

        if (Newh<24) {
            System.out.printf("%d:%02d",Newh,Newm);
        } else {
            Newh= 0;
            System.out.printf("%d:%02d",Newh,Newm);
        }
    }

}

