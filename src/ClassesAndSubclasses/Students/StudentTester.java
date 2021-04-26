package ClassesAndSubclasses.Students;

public class StudentTester {
    public static void main(String[] args) {
        Person person = new Student(); //upcasting
        //downcasting

        Person person2 = new Student();
        Student student1 = (Student) person;
        Student s3 = (Student) person2;
        Student student2 = (Student) new Person(); //not assignment compatible

        System.out.println(person instanceof Person); // true
        System.out.println(person instanceof Student); // also true
        System.out.println(person instanceof Teacher); //false

        System.out.println(student1 instanceof Person); // true
        System.out.println(student1 instanceof Student); // also true

//        System.out.println(student2 instanceof Person); // true
//        System.out.println(student2 instanceof Student); // also true

        ((Student) person).study(); //however even though person references a student object it CAN'T use the study method unless you cast it as a Student
        useStudent(person);


    }

    public static void useStudent(Person person){
        person.talkAboutSelf();
        if(person instanceof Student){
            ((Student) person).study();
        }
        else if(person instanceof Teacher){
            ((Teacher) person).teach();
        }

    }
}
