package IO;

import Arrays.A;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String currentPath = System.getProperty("user.dir");
        String location = currentPath + "\\test.html";
        File file = new File(location);
        FileWriter fileWriter = new FileWriter(location, false);
        Scanner input = new Scanner(System.in);
        System.out.println("Give webpage a title: ");
        String title = input.nextLine();
        System.out.println("Give webpage a header: ");
        String h1 = input.nextLine();
        fileWriter.write(String.format("<html>\n\t<head><title>%s</title>\n\t</head>", title));
        fileWriter.write(String.format("<body><h1>%s</h1></body></html>", h1));
        fileWriter.close();
        Scanner fileScan = new Scanner(file);
        List<String[]> linesInFile = new ArrayList<>();
        while(fileScan.hasNextLine()){
            String stringInput = fileScan.nextLine();

            linesInFile.add(stringInput.split("</?{1}[A-Za-z0-9dd]*>{1}"));
        }
        for(String[] line: linesInFile){
            for(String element: line){
                System.out.println(element);
            }
        }


    }
}
