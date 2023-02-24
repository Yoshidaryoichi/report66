package jp.ac.uryukyu.ie.e225735;

public class main extends MakeSure{
    public static void main(String args[]){
        int[] correctnumber=correctNumber();
        while(true){
            int[] getnumber = getnumber();
            int[] makesure = makesure(correctnumber, getnumber);
            if(makesure.length==3){
                System.out.println("あたり");
                break;
            }
            else{
                System.out.println("close:"+makesure[1]+"correct"+makesure[0]);
            }
        }
    }
}
