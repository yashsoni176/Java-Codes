import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        int a, rev = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = sc.nextInt();

        while(a!=0){
            int rem = a%10;
            rev = rev * 10 + rem;
            a = a/10;
        }
        System.out.println("Reverse of the number is : " + rev);
    }
}
