package Classes.Input;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         System.out.println("Entre Username");
         String Username = obj.nextLine();
         System.out.println("Entre age");

         int age = obj.nextInt();

        System.out.println("Username is " + Username + " and my age is " + age);
        obj.close();
    }
}
