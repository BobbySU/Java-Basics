import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int failedTest = Integer.parseInt(scan.nextLine());

        double score = 0;
        int failedTimes =0;
        int solveProblems =0;
        String lastExam = "";

        String examName = scan.nextLine();
        while (!examName.equals("Enough")){
            lastExam = examName;
            int examGrade = Integer.parseInt(scan.nextLine());
            if(examGrade<=4){
                failedTimes++;
            }
            if(failedTimes==failedTest){
                break;
            }
            score+=examGrade;
            solveProblems++;

            examName =scan.nextLine();
        }
        if(failedTest==failedTimes){
            System.out.printf("You need a break, %s poor grades.", failedTimes);
        }else {
            System.out.printf("Average score: %.2f%n",score/solveProblems);
            System.out.printf("Number of problems: %d%n",solveProblems);
            System.out.printf("Last problem: %s%n", lastExam);
        }
    }
}
