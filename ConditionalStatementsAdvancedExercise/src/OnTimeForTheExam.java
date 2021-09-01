import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int examH = Integer.parseInt(scan.nextLine());
        int examM = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        double examTime = examH * 60 + examM;
        double Time = h * 60 + m;
        double diffh = 0;
        double diffm = 0;

        if (examTime > Time) {
            if (Math.abs(examTime - Time) <= 30) {
                System.out.printf("On time%n%.0f minutes before the start", Math.abs(Time - examTime));
            } else {
                if (Math.abs(examTime - Time) >= 60) {
                    diffh=Math.abs(Time - examTime)/60;
                    diffm=Math.abs(Time - examTime)%60;
                    if(diffm<10){
                        System.out.printf("Early%n%.0f:0%.0f hours before the start",Math.floor(diffh),diffm);
                    }else {
                    System.out.printf("Early%n%.0f:%.0f hours before the start",Math.floor(diffh),diffm);
                    }
                } else {
                    System.out.printf("Early%n%.0f minutes before the start", Math.abs(Time - examTime));
                }
            }

        } else if (examTime == Time) {
            System.out.println("On time");
        } else {
            if(Math.abs(examTime - Time) >= 60){
                diffh=Math.abs(Time - examTime)/60;
                diffm=Math.abs(Time - examTime)%60;
                if(diffm<10){
                    System.out.printf("Late%n%.0f:0%.0f hours after the start",Math.floor(diffh),diffm);
                }else {
                System.out.printf("Late%n%.0f:%.0f hours after the start",Math.floor(diffh),diffm);
                }
            }else {
            System.out.printf("Late%n%.0f minutes after the start", Math.abs(examTime - Time));
            }
        }
    }
}
