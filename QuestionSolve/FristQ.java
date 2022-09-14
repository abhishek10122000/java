package QuestionSolve;

public class FristQ {
    public class FristQue{
        public static void main(String[] args){
            int n=5;
            for(int i=1; i<=n;i++){
                for(int j=1; j<=n-i;j++){
                    System.err.print("a");
                }
                for(int j=1; j<=n;j++){
                    if(i==1 || j==n ||i==n|| j==1){
                        System.err.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                
                System.out.println();
            }
        }
    }
}
