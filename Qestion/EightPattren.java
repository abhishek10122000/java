package Qestion;

public class EightPattren {
    public static void main(String[] args){
        int row=4;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // for(int i=row; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
    }
}
