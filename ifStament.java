import java.util.Scanner;

public class ifStament {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int min;
        System.out.print("number 1: ");
        int n1 = scn.nextInt();
        min = n1;

        System.out.print("number 2: ");
        int n2 = scn.nextInt();
        if(n2 < min){
            min = n2;
        }

        System.out.print("number 3: ");
        int n3 = scn.nextInt();
        if(n3 < min){
            min = n3;
        }

        System.out.println("The min number is:"+min);

    }
}
