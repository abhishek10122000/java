package Function;

import java.util.Scanner;

public class Add2Number {
    public static int addTwoNumber(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        addTwoNumber(x,y);
        System.out.print("sum two number"+ addTwoNumber(x,y));
    }
}
