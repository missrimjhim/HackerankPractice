import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        //System.out.println("Enter no.of elements");
        N= sc.nextInt();
        int[] arr=new int[N];
        //System.out.println("Enter Array elements");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        //a number to be divisible by 10,we need to see if the last array element ends in 0 or not.
        if(arr[N-1]%10==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


    }
}