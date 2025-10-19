package Classes.Modifiers;

// ---------------------------Non-Access Modifires----------------------------------------
/*Non access modfire is 
 * 1) final
 * 2) staic
 * 3) abstract
 */

public class NonAccessModifiers {
    
    static void fn1(){
        System.out.println("this can be use without creating any object ");
    }

    public void fn2(){
        System.out.println("This is not call wothout creating object ! ");
    }


    public static void main(String[] args) {
        final int no = 5; //  not update the value
        fn1();
        System.out.println(no);
        NonAccessModifiers f = new NonAccessModifiers();
        f.fn2();
    }
}
