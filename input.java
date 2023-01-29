import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Show Your CV");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Surname:");
        String surname = sc.nextLine();
        System.out.print("Age:");
        int age = sc.nextInt();     
        System.out.println("show the run");
        System.out.println("Name is "+name);
        System.out.println("Surname is "+surname);
        System.out.println("Age is " +age);

    }
}
