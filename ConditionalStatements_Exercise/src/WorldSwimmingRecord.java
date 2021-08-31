import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double sec = Double.parseDouble(scan.nextLine());
        double m = Double.parseDouble(scan.nextLine());
        double secM = Double.parseDouble(scan.nextLine());

        double secM2 =m*secM;
        double secAdd = (Math.floor(m/15))*12.5;

        double secAdd2 = secAdd+secM2;

        double sec2 = sec-secAdd2;

        if (sec<=secAdd2) {
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(sec2));

        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",secAdd2);
        }
    }
}
