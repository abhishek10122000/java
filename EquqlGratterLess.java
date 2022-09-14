import java.util.*;
public class EquqlGratterLess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b){
            System.out.print("a gratter then b");
        }
        else{
            if(a < b){
            System.out.print("b gratter then a");
                
            }
            else{
            System.out.print("a equal b");
                
            }
        }
    }
}
