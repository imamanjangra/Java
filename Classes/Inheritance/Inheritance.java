package Classes.Inheritance;

/*  -----------------------------------Inheritance-------------------------------------------
 * inherite attributes and method from one class to another 
 * Inheritance is two type 
 * 1) subclass(child)
 * 2) superclass(parent)
 *      extend keyword is to inheritance
 * 
*/
class student {
    protected  int Roll_no = 13;
    public void speak(){
        System.out.println("yes , Sir!");
    }
    
}
public class Inheritance extends student {
    protected String name = "Aman";
   public static void main(String[] args) {
    Inheritance in = new Inheritance();
    System.out.println(in.Roll_no);
    in.speak();
    System.out.println(in.name);
    
   } 
}
