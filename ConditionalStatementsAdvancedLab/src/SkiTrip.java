import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int day = Integer.parseInt(scan.nextLine());
        String room = scan.nextLine();
        String grade = scan.nextLine();

        int night = day - 1;
        double price = 0;

        if (room.equals("room for one person")) {
            price = night * 18;
            switch (grade) {
                case "positive":
                    price = price * 1.25;
                    System.out.printf("%.2f", price);
                    break;
                case "negative":
                    price = price * 0.9;
                    System.out.printf("%.2f", price);
                    break;
            }

        } else if (room.equals("apartment")) {
            if (night < 10) {
                price = night * 25 * 0.7;
                switch (grade) {
                    case "positive":
                        price = price * 1.25;
                        System.out.printf("%.2f", price);
                        break;
                    case "negative":
                        price = price * 0.9;
                        System.out.printf("%.2f", price);
                        break;
                }


            } else if (night >= 10 && night <= 15) {
                price = night * 25 * 0.65;
                switch (grade) {
                    case "positive":
                        price = price * 1.25;
                        System.out.printf("%.2f", price);
                        break;
                    case "negative":
                        price = price * 0.9;
                        System.out.printf("%.2f", price);
                        break;
                }

            } else if (night > 15) {
                price = night * 25 * 0.5;
                switch (grade) {
                    case "positive":
                        price = price * 1.25;
                        System.out.printf("%.2f", price);
                        break;
                    case "negative":
                        price = price * 0.9;
                        System.out.printf("%.2f", price);
                        break;

                }

            }
        } else if (room.equals("president apartment")) {
            if (night < 10) {
                price = night * 35 * 0.9;
                switch (grade) {
                    case "positive":
                        price = price * 1.25;
                        System.out.printf("%.2f", price);
                        break;
                    case "negative":
                        price = price * 0.9;
                        System.out.printf("%.2f", price);
                        break;
                }

            } else if (night >= 10 && night <= 15) {
                price = night * 35 * 0.85;
                switch (grade) {
                    case "positive":
                        price = price * 1.25;
                        System.out.printf("%.2f", price);
                        break;
                    case "negative":
                        price = price * 0.9;
                        System.out.printf("%.2f", price);
                        break;
                }
            } else if (night > 15) {
                price = night * 35 * 0.8;
                switch (grade) {
                    case "positive":
                        price = price * 1.25;
                        System.out.printf("%.2f", price);
                        break;
                    case "negative":
                        price = price * 0.9;
                        System.out.printf("%.2f", price);
                        break;

                }
            }
        }

    }
}
