package Classes.InnerClasses;

// Inner class 

// class InnerClasse{
//     public void m1(){
//         System.out.println("outer");

//     }
//     public class InnerInnerClasses {
    
//         public void m2(){
//             System.out.println("inner class !");
//         }
//     }
// }

// public class InnerClasses {
//     public static void main(String[] args) {
//         InnerClasse obj1 = new InnerClasse();
//         InnerClasse.InnerInnerClasses obj2 = obj1.new InnerInnerClasses();
//         obj1.m1();
//         obj2.m2();
//     }
// }


// Private inner class 
/*if we declare inner class whit private then it can not be access it give erroro to not access data bcz class is private   */

// Static Inner class 

// stacic inner class is access without creted objected of other object with 


class outerClasses {

    public void m1(){
        System.out.println("outer class ");

    }
    static class InnerInnerClasses {// this is a static class so it can be acces thiout create a oject of parent clas or innerclass so .... 
    
        
        public void m2(){
            System.out.print("inner class ");
        }
    }


    
}


public class InnerClasses {

    public static void main(String[] args) {
            outerClasses.InnerInnerClasses obj1 = new outerClasses.InnerInnerClasses();
            obj1.m2();

    }
}