import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        int f=1;
        if(n==0||n==1)
            return 1;
        else
            for(int i=1;i<=n;i++){
                f=f*i;
            }
        return f;
    }

        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            int N=sc.nextInt();
            int m= factorial(N);
            System.out.println(m);


    }

}
