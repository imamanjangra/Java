package Classes.Anonymous;

// Anonymous  is a class without name and used at a same time or overright exsting class 

class Anonymous_class{
    public void sound(){
        System.out.println("sound like's greate");
    }
}

//Anonymous Class from an Interface

 interface InnerAnonymous {

    public void intro();
}

public class Anonymous {
    public static void main(String[] args) {
        Anonymous_class obj = new Anonymous_class(){
            public void sound(){
                System.out.println("hello , My name is Pirate");
            }
        };// semecolon is required to end of the line to create object 

        InnerAnonymous o = new InnerAnonymous() {
            public void intro(){
                System.out.println("interface is this ");
            }
        };
        obj.sound();
        o.intro();
    }
}
