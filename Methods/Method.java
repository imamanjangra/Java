package Methods;


public class Method {

    static void Mymethod(){
        System.out.println("Hello its just a test ");
    }
    static void para(String name , int no){
        System.out.println("My name is " + name + " and my age is " + no + "!");
    }
    static int rtn(int x){
        return x*x;
    }

    static int plus(int x , int y ){
        return x + y;
    }
    static double plus(double x , double y ){
        return x + y;
    }


    public static void main(String[] args) {
        Mymethod();
        para( "Amam", 19);
        System.out.println(rtn(2));
        System.out.println(plus(1, 4));
        System.out.println(plus(1.5, 4.5));

    }
}

