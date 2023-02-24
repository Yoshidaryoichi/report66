package jp.ac.uryukyu.ie.e225735;
import java.util.Random;


public class MakeSure extends GetNumber{
    
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
    public static int[] makesure(int[] correctNumber,int[] getnumber){//プレイヤーの入力と答えが合っているかを調べる関数
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
}
