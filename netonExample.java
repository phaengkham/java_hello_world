import java.util.Scanner;
public class netonExample {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Show me the values");
    System.out.print("Enter value for m:");
    double m=sc.nextDouble();
    System.out.print("Enter value for a:");
    double a = sc.nextDouble();
    double f = 0.25;
    double F= m*a+f;
    System.out.println("show m:"+m+"g");
    System.out.println("show a:"+a+"m/s^2");
    System.out.println("show f:"+f+"N");
    System.out.println("show me the values:"+m+"*"+a+"+"+f+"="+F+"N");
    
 }   

}
