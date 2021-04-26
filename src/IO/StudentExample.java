package IO;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentExample {
    protected static Scanner scan;
    public static void main(String[] args) throws IOException {
        scan = new Scanner(System.in);



        String currentPath = System.getProperty("user.dir");
        String fname = currentPath + "\\student.txt";
        FileReader fileReader = new FileReader(fname);
        //fileReader
        FileWriter fileWriter = new FileWriter(fname, true);
        fileWriter.write(getStudentDetails().toString() + "\n");
        fileWriter.close();
    }

    public static Student getStudentDetails(){
        System.out.println("Enter Student's name: ");
        String name = scan.nextLine();

        System.out.println("Enter Student's GPA: ");
        float gpa = scan.nextFloat();

        System.out.println("Enter Student's courses separated by a comma: ");
        scan.nextLine();
        String coursesAsString = scan.nextLine();
        return new Student(name,  coursesAsString.trim().split(","), gpa);
    }
}
