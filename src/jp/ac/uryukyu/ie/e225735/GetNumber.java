package jp.ac.uryukyu.ie.e225735;
import java.util.Scanner;


public class GetNumber {
    public static int[]  getnumber(){
        int numbers[] = new int[3] ;
        int u =3;
        for(int i=0; i<3; i++){
        System.out.print(u+"桁目を入力して下さい");
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        numbers[i] = scan;
        u-=1;
    }
        return numbers;
    }
    public static void main(String[] args) {
        int[] i = getnumber();
        System.out.println(i[0]+""+i[1]+""+i[2]);
    }
}
