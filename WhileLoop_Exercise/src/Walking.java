import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int daySteps=10000;
        int stepsTotal=0;

        while (stepsTotal < daySteps) {
            String comand = scan.nextLine();
            if (comand.equals("Going home")) {
                int gohome = Integer.parseInt(scan.nextLine());
                stepsTotal+=gohome;
                break;
            }
            int steps = Integer.parseInt(comand);
            stepsTotal+=steps;
        }

        if (stepsTotal>=daySteps) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!",stepsTotal-daySteps);
        }else {
            System.out.printf("%d more steps to reach goal.",daySteps-stepsTotal);
        }
    }
}
