import java.util.Scanner;

public class footBall {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter manUnited goals:");
        int manUnited = scn.nextInt();
        System.out.print("Enter liverPool goals:");
        int liverPool = scn.nextInt();
        if(manUnited > liverPool){
            System.out.println("ManUnited win");
        }
        else if(manUnited < liverPool){
            System.out.println("LiverPool win");
        }
        else{
            System.out.println("ManUnited Equal LiverPool");
        }
    }
}
