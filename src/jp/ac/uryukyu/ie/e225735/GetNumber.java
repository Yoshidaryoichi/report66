package jp.ac.uryukyu.ie.e225735;
import java.util.Scanner;
public class GetNumber {
    public static int[]  getnumber(){//プレイヤーの入力を受け取る関数
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
}
