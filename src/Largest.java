import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        int a,b,c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter values of a b and c : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("A is largest among B and C");
        }
        else if(b>a && b>c){
            System.out.println("B is largest among A and C");
        }
        else{
            System.out.println("C is largest among A and B");
        }

    }
}
