package Function;

import java.util.Scanner;

public class Factroial {
    public static void printFactroial(int a) {
        int factroial=1;
        for(int i=a; i>=1; i--){
            factroial=factroial*i;
            System.out.print(i);
            if(i>1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("factroial"+ factroial);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int sum=1;
        // for(int i=n; i>=1; i--){
        //     sum=sum*i;
        //     System.out.print(i +"*");
        // }
        // System.out.println(sum);
        printFactroial(n);

    }
}
