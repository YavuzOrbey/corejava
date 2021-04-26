package IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriterExample {
    public static void main(String[] args){
        BufferedWriter bufferedWriter = null;
        try{
            FileWriter fileWriter;

            String currentPath = System.getProperty("user.dir");
            String fileName = currentPath + "\\YO.txt";
            fileWriter = new FileWriter(new File(fileName));
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("lololololololollololoklolo0lolopl");
        }
        catch(IOException io){
            System.out.println(io);
        }
        finally{
            try{
                bufferedWriter.close();
            }catch(Exception e){
                System.out.println(e);
            }

        }

    }
}
