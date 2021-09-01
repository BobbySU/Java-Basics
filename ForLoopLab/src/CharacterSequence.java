import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String in =scan.nextLine();
        for (int i = 0; i<in.length(); i++){
            char letter = in.charAt(i);
            System.out.println(letter);

        }
    }
}
