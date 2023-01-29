import java.util.Scanner;
public class fan {
    public static void main(String[] args) {
        System.out.println("Show your boyfriend or girlfriend history");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your boyfriend or girlfriend Name:");
        String name=sc.nextLine();
        System.out.print("Enter your boyfriend or girlfriend Surname:");
        String Surname=sc.nextLine();
        System.out.print("Enter your boyfriend or girlfriend Age:");
        int age=sc.nextInt();
        System.out.print("Enter your boyfriend or girlfriend Phone:");
        int Phone=sc.nextInt();
        System.out.print("Enter your boyfriend or girlfriend Occupation:");
        String occupation=sc.next();
        System.out.print("Enter your boyfriend or girlfriend Favorite:");
        String favorite=sc.next();
        System.out.println("Show your boyfriend or girlfriend history");
        System.out.println("Name:"+name);
        System.out.println("Surname:"+Surname);
        System.out.println("Age:"+age);
        System.out.println("Phone:"+Phone);
        System.out.println("Occupation:"+occupation);
        System.out.println("Favorite:"+favorite); 
    }
}
