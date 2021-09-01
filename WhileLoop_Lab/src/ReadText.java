import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        while (true){
            String a =scan.nextLine();
            if (a.equals("Stop")){
                break;
            }

            System.out.println(a);
        }
    }
}
