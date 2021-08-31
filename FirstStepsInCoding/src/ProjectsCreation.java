import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        int Progect = Integer.parseInt(scan.nextLine());
        int Time = Progect*3;
        System.out.printf("The architect %s will need %s hours to complete %s project/s.",Name,Time,Progect);
    }
}
