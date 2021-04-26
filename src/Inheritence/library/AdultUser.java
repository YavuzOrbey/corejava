package Inheritence.library;

public class AdultUser extends User implements LibraryUser{

    public AdultUser(int age){
        super(age);
    }
    @Override
    public void registerAccount() {
        if(age > 12 )
            System.out.println("You have successfully registered an Adult Account");
        else{
            System.out.println("Sorry you must be older than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if(bookType.equals("Fiction") ){
            System.out.println("Book Issued succesfully, please return book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only Adult fiction books");
        }
    }
}
