import java.util.Scanner;

public class ifelseStament {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please Enter Your Number");
        int x = scn.nextInt();
        if(x % 2 == 0){
            System.out.println("This is Even number:"+x);
        }else{
            System.out.println("This is odd number:"+x);
        }
    }
}
