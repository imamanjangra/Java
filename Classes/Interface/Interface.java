package Classes.Interface;

 interface InnerInterface {
    public void m1();
    public void m2();
    
}
// multiple inhertense 
 interface InnerInterface_1 {
    public void m3();
    
}

 interface InnerInterface_2 {

    public void m4();
}

 class interface_class implements InnerInterface {
    public void m1(){
        System.out.println("this is a methode first");
    }
    public void m2(){
        System.out.println("this is a methode second ");
    }
}

class inter implements InnerInterface_1 , InnerInterface_2 {// multiple inhertense 
    public void m3(){System.out.println(" This is a methode fourth");}
    public void m4(){System.out.println("this is a fifth Methode ");}
}

public class Interface {
    public static void main(String[] args) {
        interface_class i = new interface_class();
        i.m1();
        i.m2();
        inter obj = new inter();
        obj.m3();
        obj.m4();
    }
}
