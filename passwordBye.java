import java.util.Scanner;

public class passwordBye {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=scn.nextInt();
        String password;
        if(number == 9){
            System.out.print("Enter the Password:");
            password=scn.next();
            System.out.println("Password is:"+password);
        }
        System.out.println("Bye bye");
    }
}
