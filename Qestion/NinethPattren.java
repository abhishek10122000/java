package Qestion;

public class NinethPattren {
    public static void main(String[] args){
        int a=5;
        int numb=0;
        for(int i=1; i<=a; i++){
            for(int j = 1; j<=i; j++){
                numb++;
                System.out.print(numb+" ");
            }
            System.out.println();
        }
    }
}
