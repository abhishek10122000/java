package Qestion;


public class TenthPattern {
    public static void main(String[] args){
        int a=5;
        for(int i=1;i<=a;i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==1){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}