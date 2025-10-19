package Classes.Modifiers;

/*  public keybord is an access modefire 
 *          Types of Modifires
 * 1) Access Modifier -> control the access
 * 2) Non-access Modifire -> not controle access but provide other functionality 
 * 
 * ----------------------1) Access Modifire--------------------------------------------
 * 
 * # FOR CLASS    
 * 1) public => accessible by any other class
 * 2) default => onlly accessible in same class or in a same package 
 * 
 * # FOR attributes, methods and constructors
 * 1) public
 * 2) private
 * 3) default
 * 4) protected
*/


// public class AccessModifiers {

//     private String name = "Aman";
//     private int number = 13;
    
//     public static void main(String[] args) {
//         System.out.println("public for class modifire ");

//         Second obj1 = new Second(); // this is object of other class nmae is escond and access the value of public class
//         System.out.println(obj1.name);
//         System.out.println(obj1.n);

//         AccessModifiers obj2 = new AccessModifiers(); // this is private member and is access by only htis class
//         System.out.println("My name is " + obj2.name + " and my roll no is " + obj2.number);

//         // Default -> when not write a modifier then is default modifire 



//     }
// }


class carname {
    protected String name = "rtx";
    protected int Model = 142;
    // private String city = "painpat";  this can only access in same class -> give error not use 



}

public class AccessModifiers extends carname {
    public String engine = "v8";
    public static void main(String[] args) {
        AccessModifiers c = new AccessModifiers();
        System.out.println(c.name);
        System.out.println(c.Model);
        System.out.println(c.engine);
        // System.out.println(c.city); // city is not found bcz sity is private and it can access only in same class 


    }
}