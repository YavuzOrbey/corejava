package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("C:\\wamp64\\www\\Java\\CoreJavaBasics\\test.txt");
            int i;
            while((i = fileReader.read())!=-1){
                System.out.print((char) i);
            }
            System.out.println( (char) fileReader.read());
            Scanner scan = new Scanner(System.in);

            FileWriter fileWriter = new FileWriter("C:\\wamp64\\www\\Java\\CoreJavaBasics\\test.txt", true);
            fileWriter.write(scan.nextLine());

            fileWriter.close();
        }catch(FileNotFoundException ex) {
            System.out.println(ex);
            System.out.println();
        }catch (IOException e){
            System.out.println();
        }
    }
}
