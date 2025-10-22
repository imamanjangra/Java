package Files;

import java.io.File; 
import java.io.IOException;
import java.io.FileWriter;

public class CreateFiles {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}






 class fileHandling {
public static void main(String[] args) {
try {
FileWriter myWriter = new FileWriter("filename.txt");
myWriter.write("Hello my name is tarun");
myWriter.close();
} catch (IOException e) {
System.err.println("error occured" + e);
e.printStackTrace();
}
}

}