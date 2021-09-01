import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String year = scan.nextLine();
        int p = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());

        double daySofia= ((48-h)*3.0/4)+h+(p*2.0/3);

        if(year.equals("leap")){
            daySofia=daySofia*1.15;
            System.out.printf("%.0f",Math.floor(daySofia));
        }else if(year.equals("normal")){
            System.out.printf("%.0f",Math.floor(daySofia));
        }
    }
}
