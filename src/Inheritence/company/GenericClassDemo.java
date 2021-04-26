package Inheritence.company;

public class GenericClassDemo<Generic1, Generic2> {
    private Generic1 value;
    private Generic2 value2;

    public <Generic3> GenericClassDemo(Generic3 value){
    }
    public void setValue(Generic1 value){
        this.value = value;
    }

    public Generic1 getValue(){
        return this.value;
    }
}
