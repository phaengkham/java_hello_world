import java.util.Scanner;

public class showPassword {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String password = "123@123";
        int number = 2;
        System.out.print("Enter the charater: ");
        int showPassword = scn.nextInt();
        if(showPassword == number){
            System.out.println("Password is:"+password);
        }
        else{
            System.out.println("********");
        }

    }
}
