package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFileFromScanner {
    public static void main(String[] args) {
        //NOTE variables created in try cannot be used in catch or finally
        try{
            Scanner scan = new Scanner(new File("C:\\wamp64\\www\\Java\\CoreJavaBasics\\YO.txt"));
            System.out.println(scan.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
