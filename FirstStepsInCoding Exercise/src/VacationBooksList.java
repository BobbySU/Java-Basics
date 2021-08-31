import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int brStranici = Integer.parseInt(scan.nextLine());
        int Stranici = Integer.parseInt(scan.nextLine());
        int dni = Integer.parseInt(scan.nextLine());
        int rezultat = (brStranici/Stranici)/dni;

        System.out.println(rezultat);
    }
}
