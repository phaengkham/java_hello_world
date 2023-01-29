import java.util.Scanner;

public class openScore {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int key; float score,percent;
        System.out.print("Press key to continue: ");
        key = scn.nextInt();
        if(key == 1){
            System.out.println("Enter your score: ");
            score=scn.nextFloat();
            percent=(score/50.0f*100);
            System.out.println("Your Score is: "+percent);
        }
        System.out.println("Please check new number");

    }
}
