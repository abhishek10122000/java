import  java.util.*;
public class SwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("button 1 click sum\nbutton 2 click sub\nbutton 3 click multi\nbutton 4 click divison\nbutton 5 click modlus\n");
        
        int c = sc.nextInt();
        switch(c){
            case 1 : 
                System.out.print(a+b);
                break;
            case 2 : 
                System.out.print(a-b);
                break;
            case 3 : 
                System.out.print(a*b);
                break;
            case 4 : 
                System.out.print(a/b);
                break;
            case 5 : 
                System.out.print(a%b);
                break;
            default :
                System.out.print("sorrey");
        }
    }
}
