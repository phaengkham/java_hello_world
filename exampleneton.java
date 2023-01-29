import java.util.Scanner;

public class exampleneton {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("show the values:");
        System.out.print("Enter m:");
        double m = scn.nextDouble();
        System.out.print("Enter a:");
        double a = scn.nextDouble();
        double F = m*a;
        System.out.println("Show m:"+m);
        System.out.println("Show a:"+a);
        System.out.println("Show F:"+F);

    }
}
