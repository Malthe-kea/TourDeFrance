package DataObject;

import java.util.ArrayList;

public class Student implements DataObject{

    private int ID;
    private String name;
    private String email;

    public Student(String name, int ID, String email){
        this.ID = ID;
        this.name = name;
        this.email = email;
    }

    @Override
    public int getId(){
        return ID;
    }

    @Override
    public ArrayList<String> getData(){
        ArrayList<String> data = new ArrayList<>();
        data.add("name: " + name);
        data.add("ID: " + ID);
        data.add("Email: " + email);

        return data;
    }
}
