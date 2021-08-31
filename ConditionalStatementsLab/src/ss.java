import java.util.Scanner;

public class ss {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cenaEkskurziq = Double.parseDouble(scanner.nextLine());
        int brPuzeli = Integer.parseInt(scanner.nextLine());
        int brKukli = Integer.parseInt(scanner.nextLine());
        int brMecheta = Integer.parseInt(scanner.nextLine());
        int brMinioni = Integer.parseInt(scanner.nextLine());
        int brKamioncheta = Integer.parseInt(scanner.nextLine());

        //cenite

        double cenaPuzeli = brPuzeli * 2.60;
        double cenaKukli = brKukli * 3.00;
        double cenaMecheta = brMecheta * 4.10;
        double cenaMinioni = brMinioni * 8.20;
        double cenaKamioncheta = brKamioncheta * 2.00;

        double summAll = cenaPuzeli + cenaKukli + cenaMecheta + cenaMinioni + cenaKamioncheta;

        int sborNaVsichkiIgrachki = brPuzeli + brKukli + brMecheta + brMinioni + brKamioncheta;
        //kod na kolega dosta sykraten

        if (sborNaVsichkiIgrachki >= 50) {
            summAll = summAll - (summAll * 25 / 100);
        }

        summAll = summAll - (summAll * 10 / 100);

        double ostavashtiKintiSledEkskurziqta = Math.abs(summAll - cenaEkskurziq);

        if (summAll >= cenaEkskurziq) {
            System.out.printf("Yes! %.2f lv left.", ostavashtiKintiSledEkskurziqta);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", ostavashtiKintiSledEkskurziqta);
        }
    }
}
