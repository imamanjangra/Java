package Classes.Enums;

enum type{
    Outstanding,
    pass,
    fail,
}

public class Enums {
    enum Level{
        first,
        Second,
        Third
    }
    public static void main(String[] args) {
        Level myLevel = Level.first;
        System.out.println(myLevel);

        type grade = type.Outstanding;

        switch (grade) {
            case Outstanding:
                System.out.println("Outstanding marks");
                break;
            case pass:
                System.out.println("pass marks");
                break;
            case fail:
                System.out.println("fail marks");
                break;
            
            default:
            System.out.println("result not found");
                break;
        }
    }

}
