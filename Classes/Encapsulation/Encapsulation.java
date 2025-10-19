package Classes.Encapsulation;


/*------------------------------Encapsulation------------------------------ 
 * sensitive data hide from user 
 * it use two methode to hide data from user is first get and set 
 * 1) get()
 * 2) set()
 * 
 * 1) get()
 *          it return the value of variable 
 * 2) set()
 *          it set the value of vrabile 
 * 
 * bcz private member is not access value if is on onother class so use get or set methode to access value 
 * 
*/



 class data {

    private String name = "Aman";

    public String getdata(){
        return name;
    }

    public void setdata(String newname){
        this.name = newname;
    }
    
}

public class Encapsulation {
    public static void main(String[] args) {
        data obj1 = new data();

        obj1.setdata("hero");
        System.out.println(obj1.getdata());

    }
}
