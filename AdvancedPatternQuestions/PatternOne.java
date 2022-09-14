package AdvancedPatternQuestions;

public class PatternOne {
    public static void main(String[] args){
        int a=4;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            int space=2*(a-i);
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=a; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            int space=2*(a-i);
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
