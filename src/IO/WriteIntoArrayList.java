package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteIntoArrayList {
    public static void main(String[] args) throws FileNotFoundException {
            String location = "C:\\Users\\Yavuz\\Documents\\PerScholas\\Week5\\DeckBuilder.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<String[]> data = new ArrayList<>();
            while(input.hasNextLine()){
                String line = input.nextLine();
                data.add(line.split(","));
            }
            for(String[] line: data){
                System.out.println(line[0] + " | " + line[1]);
            }

            String str = "";
            str +="dsads";
    }
}
