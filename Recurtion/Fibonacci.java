import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(fibo(n));
       sc.close();

    }

    public static int fibo(int n){
        if(n<0){
            System.out.println("Enter Positive No.");
            return -1;
        }else if(n==0||n==1){
            return 1;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    
}
