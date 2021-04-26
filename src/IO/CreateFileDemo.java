package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String currentPath = System.getProperty("user.dir");
        String fname = currentPath + "\\test.txt";
        System.out.println(fname);
        File f = new File(fname);
        try {

            if(f.createNewFile())
            {
                System.out.println("File is created:" + f.getName());
                FileWriter w = new FileWriter(f, true);
                w.write("This is my content, today is wednesday");

            }
            else {
                FileWriter w = new FileWriter(f, true);
                w.write(", Hello are you going to perform excercise");
                System.out.println("Content is included in a file");
            }
        }
        catch ( IOException e) {
            // TODO: handle exception
            System.out.println("Error" + e);
        }
    }
}