package jp.ac.uryukyu.ie.e225735;
import java.util.Random;
import java.util.Scanner;

public class MakeSure {
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
    public static int[] correctNumber(){//答えとなる三桁の整数をランダムに作る関数//
        while(true){
            Random rand = new Random();
            int num1 = rand.nextInt(10) ;
            int num2= rand.nextInt(10) ;
            int num3 = rand.nextInt(10) ; 
            if((num1 != num2)&&(num1 != num3)&&(num2 != num3)){  
                int [] correctNumber = {num1,num2,num3};
                return correctNumber;    
            }
        }
   
       
    }
    public static int[] makesure(int[] correctNumber,int[] getnumber){
        int close=0;
        int correct=0;
        if((correctNumber[0]==getnumber[0])&&(correctNumber[1]==getnumber[1])&&(correctNumber[2]==getnumber[2])){
            return correctNumber ;
        }
        for(int i = 0; i<3; i++){
            for(int u = 0; u<3; u++){
                if(correctNumber[i]==getnumber[u]){
                    if(i==u){
                        correct+=1;
                    }
                    else{
                        close+=1;
                    }
                }
            }
        }
        int[] hints = {correct,close};
        return hints;
    }

    public static void display(int[] list){
        if(list.length==3){
            System.out.println("あたり");
        }
        else{
            System.out.println("close:"+list[1]+"correct"+list[0]);
        }
    }
}
