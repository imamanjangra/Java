package Classes.classBasic;

// public class Basic {

//     int x = 5;
//     int y;
//     public static void main(String[] args) {
//         Basic n = new Basic();
//         Main m = new Main(); // main class object of another file  or new class object 
//         System.out.println(m.x);
//         System.out.println(n.x);
//         Basic c = new Basic();
//         c.y = 20;
//         System.out.println(c.y);
//         Basic c2 = new Basic();
//         c2.x = 10;// create a 2nd object 
//         System.out.println(c2.x);


//     }
// }

// public class Basic {

//     static void first(){
//         System.out.println("hello i am not need of any object bcz i am a static method ");
//     }

//     public void second(){
//         System.out.println("helllo , i need a object bcz i am public");
//     }

//     public void third(int x){
//         System.out.println("heeeelo" +  x);
//     }

//     public static void main(String[] args) {
//         first();
//         Basic obj = new Basic();
//         obj.second();
//         obj.third(5);

//         Main obj2 = new Main();
//         obj2.print();
//         obj2.data(15);
//     }

    
// }




// -------------------------------Constructor-------------------------------------

// public class Basic {

//     int x;

    

//     public Basic(int y){
//        this.x = y;
//     }
//     public static void main(String[] args) {
//         Basic obj1 = new Basic(3);
//         System.out.println(obj1.x);

//     }
// }

// -------------------------------this keybord-------------------------------------------------------

public class Basic {

    int x ;
    String name ;

    public Basic(int n){
        this(n , "Aman");
    }

    public Basic(int n , String name){
        this.x = n;
        this.name = name;
    }

    public void print(){
        System.out.println(  " My name is " + name + " Age " + x);
    }
    public static void main(String[] args) {
        Basic obj1 = new Basic(3);
        Basic obj2 = new Basic(2 , "Aman");

        obj1.print();
        obj2.print();


    }
}