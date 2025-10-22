package Errors;
/* Types of error 
 * 1) Compile-time error -> Detected by the compiler.
 * 2) Runtime error -> Occurs while the program is running
 * 3) Logical error -> Code runs but gives incorrect results
 */

 /* try catch block to solve the problem of creash the program 
  *  try 
     catch
  */
// public class Errors {
//     public static void main(String[] args) {
//             int[] no = {1 , 2 , 3};
//             try{
//                System.out.println(no[4]); 
//             }
//             catch(Exception e){
//                 System.out.println("Error is accuress in program ");
//             }finally{
//                 System.out.println("Errors.main()");
//             }
//     }
// }

// import java.util.Scanner;

// public class Errors {

//     static void m1(int n){
//         if(n <= 18){
//             throw new ArithmeticException("You year is not valid $x");// this is a coustome error 
//         }
//         else{
//             System.out.println("Your age is = " + n);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner obj1 = new Scanner(System.in);
//         System.out.println("Entre Number = ");
//         int no = obj1.nextInt();
//         m1(no);
//         obj1.close();// it use to prvent to resource leak or save for warning  
//     }
// }

// ------------------------------- Multiple Exceptions----------------------------------

public class Errors {

    public static void main(String[] args) {
        int[] array = {1 ,2 ,3,4};
        try{
            // int result = 10/0;
            System.out.println(array[5]);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){ // use a multiple error add into them 
            System.out.println("Arithmetic or array index is not found ");
        }
        catch(Exception e){// this is general statement like add always 
            System.out.println("Something want wrong");
        }
        finally{// this is a final statement 
            System.out.println("this is a final statement ");
        }
    }
}