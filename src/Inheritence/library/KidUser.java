package Inheritence.library;

public class KidUser extends User implements LibraryUser{


    public KidUser(int age){
        super(age);
    }
    @Override
    public void registerAccount() {
        if(age < 12)
            System.out.println("You've successfully registered a Kids Account");
        else
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }

    @Override
    public void requestBook() {
        if(bookType.equals("Kids")){
            System.out.println("Book issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
