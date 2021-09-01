import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int a= Integer.parseInt(scan.nextLine());
        int b= Integer.parseInt(scan.nextLine());
        int h= Integer.parseInt(scan.nextLine());
        int volume = a*b*h;

        String end = scan.nextLine();
        while (!end.equals("Done")){
            int box = Integer.parseInt(end);
            volume-=box;
            if (volume<0){
                break;
            }
            end=scan.nextLine();
        }

        if (volume<0){
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(volume));
        }else {
            System.out.printf("%d Cubic meters left.",Math.abs(volume));
        }
    }
}
