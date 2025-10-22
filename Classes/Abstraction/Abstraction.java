package Classes.Abstraction;

// Abstraction is a process of hiding the information and showing the important information 

abstract class InnerAbstraction {

    // Abstract methode dose not have a body in there 
    public abstract void sound();

}

 class second extends InnerAbstraction {
public void sound(){
    System.out.println("hello , How are you!");
}
    
}

public class Abstraction {

    public static void main(String[] args) {
        second obj = new second();
        obj.sound();
    }
}
