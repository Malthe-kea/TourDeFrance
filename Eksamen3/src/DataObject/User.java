package DataObject;

import java.util.ArrayList;

public class User implements DataObject{

    private int ID;
    private String name;

    private String userName;

    public User(int ID, String name, String userName){
        this.ID = ID;
        this.name = name;
        this.userName = userName;
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
        data.add("Username: " + userName);

        return data;
    }

    @Override
    public String toString(){
        return name + " " + userName + " " + ID;
    }
}
