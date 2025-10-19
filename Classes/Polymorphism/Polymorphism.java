package Classes.Polymorphism;

class car{
    public void type(){
        System.out.println("ther are many types of car are avlabel in markert");
    }
}

class old_car extends car{
    public void type(){
        System.out.println("this is  old car");
    }
}
class morden_car extends car{
    public void type(){
        System.out.println("this is a morden car ");
    }
}

class new_car extends car{
    public void type(){
        System.out.println("this is a new car ");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("hello");
        car c = new car();
        car o = new old_car();
        car m = new morden_car();
        car n = new new_car();

        c.type();
        o.type();
        m.type();
        n.type();
    }
}
