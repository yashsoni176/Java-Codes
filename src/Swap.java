import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {

        int a,b,temp;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();

        System.out.println("Before swapping a and b are : "+ a +" "+ b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping a and b are : "+ a +" "+ b);
    }
}
