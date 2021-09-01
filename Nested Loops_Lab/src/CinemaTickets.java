import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String move = scan.nextLine();
        int totalstandard = 0;
        int totalstudent = 0;
        int totalkid = 0;
        double alltotal = 0;

        while (!move.equals("Finish")) {
            int plase = Integer.parseInt(scan.nextLine());
            int standard = 0;
            int student = 0;
            int kid = 0;
            double total = 0;
            String tiket = scan.nextLine();
            while (tiket.equals("standard") || tiket.equals("student") || tiket.equals("kid") || tiket.equals("End")) {
                switch (tiket) {
                    case "End":
                        break;
                    case "standard":
                        standard++;
                        totalstandard++;
                        total++;
                        alltotal++;
                        break;
                    case "student":
                        student++;
                        totalstudent++;
                        total++;
                        alltotal++;
                        break;
                    case "kid":
                        kid++;
                        totalkid++;
                        total++;
                        alltotal++;
                        break;
                }
                tiket = scan.nextLine();
            }
            double procent = total / plase * 100;
            System.out.printf("%s - %.2f%% full.%n", move, procent);
            move = tiket;
        }
        double procent2 = totalstudent / alltotal * 100;
        double procent3 = totalstandard / alltotal * 100;
        double procent4 = totalkid / alltotal * 100;
        System.out.printf("Total tickets: %.0f%n %.2f%% student tickets.%n %.2f%% standard tickets.%n %.2f%% kids tickets."
                , alltotal, procent2, procent3, procent4);
    }
}

