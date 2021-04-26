package ExampleCodeFromClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentInformation {
    static ArrayList<Student> al = getStudentAllInfo();

    public ArrayList<Student> getAl() {
        return al;
    }

    public String toString()
    {
        String info = "";
        for(Student a : al)
        {
            int studentAge = a.getAge();
            String studentName = a.getName();
            int studentNumber =  a.getRollnum();
            info += "age: " + studentAge + ", name: " + studentName + ", roll number: " + studentNumber + "\n" ;

        }
        return info;
    }

    private static ArrayList<Student> getStudentAllInfo()
    {
        int[] age = {101,22,22,33,66,88,44,77};
        int[] roll = {1,2,3,4,5,6,7,8};
        String[] name = {"Yavuz","Jim","Jane","John","Jimmy","Jones","Jake","Jack"};

        List<Student> sList =  Arrays.asList(new Student[8]);
        System.out.println(sList);
        for(int i=0; i<sList.size(); i++)
        {
            sList.get(i).setAge(age[i]);
            sList.get(i).setName(name[i]);
            sList.get(i).setRollnum(roll[i]);
        }
        return (ArrayList<Student>) sList;
    }
}