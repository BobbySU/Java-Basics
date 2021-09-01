import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String flower=scan.nextLine();
        double number = Double.parseDouble(scan.nextLine());
        double sum = Double.parseDouble(scan.nextLine());

        double total=0;

        switch (flower){
            case "Roses":
                if (number>80){
                    total=number*5*0.9;
                }else {
                    total=number*5;
                }
                break;
            case "Dahlias":
                if (number>90){
                    total=number*3.8*0.85;
                }else {
                    total=number*3.8;
                }
                break;
            case "Tulips":
                if (number>80){
                    total=number*2.8*0.85;
                }else {
                    total=number*2.8;
                }
                break;
            case "Narcissus":
                if (number<120){
                    total=number*3*1.15;
                }else {
                    total=number*3;
                }
                break;
            case "Gladiolus":
                if (number<80){
                    total=number*2.5*1.2;
                }else {
                    total=number*2.5;
                }
                break;

        }
        if (sum>=total){
            System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.",number,flower,Math.abs(total-sum));
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(total-sum));
        }
    }
}
