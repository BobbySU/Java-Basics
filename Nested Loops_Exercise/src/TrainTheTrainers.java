import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int juge = Integer.parseInt(scan.nextLine());
        String comand = scan.nextLine();

        double all=0;
        int countP=0;

        while (!comand.equals("Finish")){
            String pres=comand;
            countP++;

            double sumGrade=0;
            double avgGrade=0;

            for (int i = 0; i < juge; i++) {
                double grade=Double.parseDouble(scan.nextLine());
                sumGrade+=grade;
            }
            avgGrade=sumGrade/juge;
            all+=avgGrade;
            System.out.printf("%s - %.2f.%n",pres,avgGrade);

            comand=scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.%n",all/countP);
    }
}
