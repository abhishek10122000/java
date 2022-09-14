import java.util.*;
public class IfElseStatement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<18){
            System.out.println("not adult");
        }
        else{
            System.out.println("adult");
        }
    }
}
