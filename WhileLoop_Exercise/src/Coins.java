import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double change = Double.parseDouble(scan.nextLine());
        int caunt =0;
        double chengeSt=Math.round(change*100);

        while (chengeSt>0){
            if(chengeSt>=200) {
                chengeSt-=200;
                caunt++;
            }else if(chengeSt>=100) {
                chengeSt-=100;
                caunt++;
            }else if(chengeSt>=50) {
                chengeSt-=50;
                caunt++;
            }else if(chengeSt>=20) {
                chengeSt-=20;
                caunt++;
            }else if(chengeSt>=10) {
                chengeSt-=10;
                caunt++;
            }else if(chengeSt>=5) {
                chengeSt-=5;
                caunt++;
            }else if(chengeSt>=2) {
                chengeSt-=2;
                caunt++;
            }else if(chengeSt>=1) {
                chengeSt-=1;
                caunt++;
            }
        }
        System.out.println(caunt);
    }
}
