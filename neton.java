import java.util.Scanner;

public class neton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("show the value:");
        System.out.print("Enter m:");
        double m = sc.nextDouble();
        System.out.print("Enter a:");
        double a = sc.nextDouble();
        double F = a*m;
        System.out.println("Show m: "+m);
        System.out.println("Show a: "+a);
        System.out.println("Show the result: "+F);

    }
}
