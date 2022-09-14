package Array;

import java.util.Scanner;

public class Linear {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        for(int i=0;i<number.length;i++){
            if(number[i]==n){
                System.out.println("hbashjashvajka");
            }
        }
    }
}
