package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FIleIO {
    public static void main(String[] args) throws IOException {
//        String fname ="";
//        File file  = null;
//        System.out.println(file.getName()); //just going to get whatever is after the last forward/back slash
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath()); //going to assume it's in the project folder




//        String[] fileList = file.list(); //for directories
//
//        for(String name: fileList){
//            if(name.endsWith(".txt"))
//                System.out.println(name);
//        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter html file name:");
        String name  = scan.next();
        createHTMLSkeleton(name);
        }

//
//        if(file.exists()){
//            System.out.println("dsadasd");
//        }
//        Scanner scan = new Scanner(file);
//        while(scan.hasNextLine()){
//            System.out.println(scan.nextLine());
//        }

    public static void createHTMLSkeleton(String name) throws IOException {
        String currentPath = System.getProperty("user.dir");
        String fileName = currentPath + "\\" + name + ".html";
        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(file, false);
        if(file.createNewFile()){
            System.out.println("File Created");
            fileWriter.write("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "  <head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>title</title>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "  \n" +
                    "  </body>\n" +
                    "</html>");
        }else{
            System.out.println("File is writing!");
            fileWriter.write("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "  <head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>title</title>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "  \n" +
                    "  </body>\n" +
                    "</html>");
            fileWriter.close();
        }
    }
    }
