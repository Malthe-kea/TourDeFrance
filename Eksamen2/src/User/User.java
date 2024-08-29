package User;

import java.util.Random;

public class User {
    Random rnd = new Random();
    private String fullName;
    private String userID;

    public User(String fullName, String userID){
        this.fullName = fullName;
        this.userID = userID;
    }

    public boolean validUserID(){
        return userID.matches("[a-z]{4}\\d{4}");
    }
}
