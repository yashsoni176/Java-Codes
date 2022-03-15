import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = sc.nextInt();

        if ((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0)))
            System.out.println(a + " is a leap year");
        else
            System.out.println(a + " is not a leap year");
    }
}
