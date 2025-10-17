// class Demo {
//     public static void main(String[] args) {
//         String name = "Aman";
//         System.out.println(name + "Jangra");
        
//     }
// }

// ----------------------Types of Print statement---------------------------------------

// public class Demo {

//     public static void main(String[] args) {
//         System.out.println("Aman");// print to the next line 
//         System.out.println("jangra");


//         System.out.print("Tarun");// print in same line 
//         System.out.print(81);// print in same line 
//     }
// }

// --------------------------Types of variables -----------------------------------------

/* Types of variables in java
1) String
2) int
3)float
4) char
5) boolean

*/ 

// final variable 

// public class Demo {

//     public static void main(String[] args) {
//        final int num1 = 50; // final or constant not overright the exsiting content this is final value 
//         System.out.println(num1);
//         System.out.println("number is = " + num1);
//         System.out.println("number is = " + num1 + 3); // if we add ito string then all data is considered into string so result is come ito string 
//         System.out.println("number is = " + (num1 + 3));// in which add into number 

//         // multiple assigment 
//         int a , b , c ;
//         a = b = c = 20;
//         System.err.println(a + b + c);
//     }
// }

// ex 

// public class Demo {

//     public static void main(String[] args) {
//         int num1 = 10;
//         int num2 = 2;

//         // calculate area of reactangle

//         int area = num1 * num2;
//         System.out.println("Area of rectangle is = " + area);
//     }
// }

/* --------------------------TYPES OF DATA ----------------------------------
                1) Primitive data            2) NON-Primitive data

                    1)Primitive data -> includes byte, short, int, long, float, double, boolean and char
                                a) integer type                  b) float type 

                                    a) integer number -> Integer types stores whole numbers, positive or negative ->byte, short, int , long
                                    b) float type -> numbers with a fractional part, containing one or more decimals. -> float , double 

                    2)Non-Primitive data -> such as String, Arrays and Classes

*/ 

//  ----------------------------------  var KEYWORD-----------------------------------

// public class Demo {

//     public static void main(String[] args) {
//         var num = 12;  // is same as js it auto conver data type of give data 
//         System.out.println(num);
//         var str = "Aman";
//         System.out.println(str);

//     }
// }

/*   -----------------------------------------type casting -----------------------------------------------
        1) Widening Casting -> smaller to larger (automatic)
        2) Narrowing Casting -> larger to smaller (Manual)
*/

// public class Demo {
// public static void main(String[] args) {
//     int no = 9;
//     double n2 = no;
//     System.out.println(n2);

//     double a = 3.14d;
//     int b = (int) a;
//     System.out.println(b);
// }
    
// }


// --------------------------short hand assigment operator---------------------------------


// public class Demo {

//     public static void main(String[]  args){
//         // 1 &
//         int x = 6;      // 0110
//         x &= 4;         // 0100
//                         //-------
//                         // 0100 -> 4
//         System.out.println(x); // ans => 4

//         // 2 |
        
//         int y = 7;  //  0111
//         y |= 3; //      0011
//                 //      ----
//                 //      0111 -> 7
//         System.out.println(y);

//         // 3 ^

//         int z = 8;  // 1000
//         z ^= 9; //     1001
//                 //     ----
//                 //     0001
//         System.out.println(z); // ans => 1

//         // 4 >> 
//         int a = 30; // 00011110
//         a >>= 3; // 
//          System.out.println(a);    


//          // 5 <<
//          int b = 40; // 0 0 1 0 1 0 0 0

//          b <<= 2; // 10100000
//          System.out.println(b);
//     }
// }

// ------------------------String ---------------------------------

// public class Demo {

//     public static void main(String[] args) {
//         String name = "plese find the where is Aman name is occure @@@!!!!";
//         System.out.println(name.length());
//         System.out.println(name.indexOf("Aman"));
//         System.out.println(name.toLowerCase());
//         System.out.println(name.toUpperCase());
//         System.out.println(name.charAt(0));

//         String a = "Aman";
//         String b = "Aman";

//         String c = "Tarun";
//         String d = "Jangra";

//         System.out.println(a.equals(b));
//         System.out.println(c.equals(d));

//         String trm = "   Aman";
//         System.out.println(trm);
//         System.out.println(trm.trim());

//         System.out.println(a.concat(d));


//     }
// }




// -------------------------Math-----------------------------------------

// public class Demo {

//     public static void main(String[] args) {
//         var n1 = 3;
//         var n2 = 5;
//         System.out.println(Math.max(n1, n2));// give max value  
//         System.out.println(Math.min(n1, n2));// give minimum value 

//         System.out.println(Math.sqrt(25));// find squrate of value 

//         System.out.println(Math.abs(-20));// conver into positive 

//         System.out.println(Math.pow(n1, n2));// convert into power 3 power of 5 
        
//         System.out.println(Math.round(3.9)); // round of number -> output = 4
//         System.out.println(Math.ceil(2.1));// this remove decimal no and increase value one -> output -> 3.0 
//         System.out.println(Math.floor(3.9));// this only remove decimal value => output => 3.0


//         System.out.println(Math.random());// give a random no between 0 to 1
//         System.out.println((int)(Math.random() *101));// generate randome number b/w 0 to 100
//     }
// }



// ---------------------------------Loops--------------------------------------------

// public class Demo {

//     public static void main(String[] args) {
//         // while 
//         // int i  = 1;
//         // while (i <= 10 ) {
//         //     System.out.println(i);
//         //     i++;
//         // }
        
//         // do while 
//         // int i = 1;
//         // do{
//         //         System.out.println(i);
//         //         i++;
//         // }
//         // while(i <= 10);

//         // for loop 

//         // for(int i = 0 ; i<=10 ; i++){
//         //     System.out.println(i);
//         // }


//         // for each loop ]

//         // String[] name ={"Aman" , "Tarun" , "Anuj" , "Ankush" , "Yash"};

//         // for(String n : name){
//         //     System.out.println(n);
//         // }
//     }
// }



// --------------------------------------------Array----------------------------------
public class Demo {

    public static void main(String[] args) {
        
        String[] cars = {"BMW" , "Volvo" , "Aude"};
        
        System.out.println(cars[0]);

        String[] name  =  new String[2];
        name[0] = "Aman";
        name[1] = "Tarun";
        

        System.out.println(name[0]);

        int[][] number = {{1 , 2 , 3} ,{5 , 7, 8}};

        System.out.println(number[0][1]);
        System.out.println(number[0].length);
    }
}