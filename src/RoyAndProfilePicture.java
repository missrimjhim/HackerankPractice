import java.util.Scanner;

public class RoyAndProfilePicture {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int L=0;
        L=sc.nextInt();
        int n=0;
        n=sc.nextInt();
        while(n-->0){
            int w=sc.nextInt();
            int h=sc.nextInt();
            if (w<L||h<L)
                System.out.println("UPLOAD ANOTHER");

            else

            if((w>=L&&h>=L)&&(w==h))
                System.out.println("ACCEPTED");

            else{
                System.out.println("CROP IT");
            }
        }
    }
}
