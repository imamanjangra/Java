package Classes.Super;

/*------------------------------Super keyword--------------------------
 * use -> access subclass or element confiution 
 * access parent element 
 */

class Animal{
    String name = "cat";

     Animal(){
        System.out.println("hello , cat ");
    }
}

class cat extends Animal{
    String name = "sound";
    cat(){
        super();// call constructor of cat 
        System.out.println("helleo");
    }
    public void print(){
        System.out.println(name);// simple 
        System.out.println(super.name);// this access parent element or variable 
    }
    public void sound(){
        // super.Animal();// call parent element 
        
        System.out.println("cat tell may i come !!!!!!!!");
    }
}



public class Super {
 public static void main(String[] args) {
    cat c = new cat();
    c.sound();
    c.print();
 }   
}

