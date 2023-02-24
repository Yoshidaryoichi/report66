package jp.ac.uryukyu.ie.e225735;
import java.util.Random;


public class MakeNumber {

    public static void main(String args[]){
        
        int i[]=correctNumber();
        System.out.println(i[0]+""+i[1]+""+i[2]);
    }

    public static int[] correctNumber(){
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
    
      
}
