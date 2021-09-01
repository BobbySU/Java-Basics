import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String name = scan.nextLine();
        int i=1;
        double total=0;
        int repeat =0;

        while (i<=12) {
            double score =Double.parseDouble(scan.nextLine());
            if (score<4){
                repeat++;
                if (repeat==2){
                    break;
                }else
                continue;
            }
            total+=score;
            i++;
        }
        if (repeat==2){
            System.out.printf("%s has been excluded at %d grade",name,i);
        }else {
            double Aver =total/12;
            System.out.printf("%s graduated. Average grade: %.2f",name,Aver);
        }
    }
}
