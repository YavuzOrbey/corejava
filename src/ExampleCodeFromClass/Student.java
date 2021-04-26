package ExampleCodeFromClass;

public class Student {

    private int rollnum;
    private String name;
    private int age;

    public Student()
    {
        age = 0;
        name = "";
        rollnum = 0;
    }
    public Student(int rollnum, String name, int age)
    {
        this.age = age;
        this.name =name;
        this.rollnum = rollnum;
    }
    public int getRollnum() {
        return rollnum;
    }
    public void setRollnum(int rollnum) {
        this.rollnum = rollnum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
