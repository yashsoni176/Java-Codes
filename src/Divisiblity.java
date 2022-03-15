import java.util.Scanner;

public class Divisiblity {

    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = sc.nextInt();

        if(a%8==0){
            System.out.println("Divisible by 8");
        }
        else{
            System.out.println("Not divisible by 8");
        }
    }
}
