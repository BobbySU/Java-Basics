import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int total=0;
        String in =scan.nextLine();
        for (int i = 0; i <in.length() ; i++) {
            char symbol = in.charAt(i);

            switch (symbol){
                case 'a':
                    total=total+1;
                    break;
                case 'e':
                    total=total+2;
                    break;
                case 'i':
                    total=total+3;
                    break;
                case 'o':
                    total=total+4;
                    break;
                case 'u':
                    total=total+5;
                    break;

            }
        }
        System.out.println(total);
    }
}
