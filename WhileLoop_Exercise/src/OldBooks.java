import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String bookName = scan.nextLine();
        String book = scan.nextLine();
        int n = 0;
        Boolean stop=false;

        while (!book.equals("No More Books")){
            if (book.equals(bookName)){
                stop=true;
                break;
            }
            n++;
            book=scan.nextLine();
        }
        if (stop){
            System.out.printf("You checked %d books and found it.",n);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",n);
        }
    }
}
