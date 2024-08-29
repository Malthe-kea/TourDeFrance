package Names;

import java.util.ArrayList;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    private String[] fullNameArrWOMiddlename = new String[2];
    private String[] fullNameArr = new String[3];


    public Name(String fullNameInput) {
        String[] fullNameArr = fullNameInput.split(" ");
        if (fullNameArr.length == 3) {
            for (int i = 0; i < fullNameArr.length; i += 3) {
                this.firstName = fullNameArr[i];
                this.middleName = fullNameArr[i + 1];
                this.lastName = fullNameArr[i + 2];
            }
        }
    }


    @Override
    public String toString() {
        if (fullNameArr.length < 2) {
            return "\nFirst name: " + firstName + "\nLast name: " + lastName;
        } else {
            return "\nFirst name: " + firstName + "\nMiddle Name: " + middleName + "\nLast name: " + lastName;
        }
    }
}
