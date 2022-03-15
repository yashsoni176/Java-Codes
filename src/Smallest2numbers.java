import java.util.Scanner;

public class Smallest2numbers {

    public static void main(String[] args) {

        int a,b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();

        if(a>b){
            System.out.println(b + " is smaller than " + a);
        }
        else{
            System.out.println(a + " is smaller than " + b);
        }

    }
}
