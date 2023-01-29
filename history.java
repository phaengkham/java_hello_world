import java.util.Scanner;

public class history {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Show me the History");
      System.out.print("Enter your name:");
      String name = sc.nextLine();
      System.out.print("Enter your surname:");
      String surname = sc.nextLine();
      System.out.print("Enter your age:");
      int age = sc.nextInt();
      System.out.println("Show me the History"); 
      System.out.println("Show Name:"+name);
      System.out.println("Show Surname:"+surname);
      System.out.println("Show Age:"+age);

    }
}
