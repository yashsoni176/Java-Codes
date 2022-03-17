import java.util.Scanner;

public class Prime {

    public static Boolean isPrime(int n){
        for(int i=2;i<n/i;++i){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();

        System.out.println("\"Prime numbers in range are : ");
        for(int n = a; n<=b; n++ ){
            if(isPrime(n)){
                System.out.println(n);
            }
        }
    }
}
