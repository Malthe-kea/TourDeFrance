package StudentOgUser;

import java.util.ArrayList;

public class Student implements DataObject{

    private int id;
    private String name;
    private String email;

    public Student(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    @Override
    public String toString(){
        return name.toLowerCase();
    }

    @Override
    public int getId(){
        return id;
    }

    @Override
    public ArrayList<String> getData(){
        ArrayList<String> tempArr = new ArrayList<>();
        String str = Integer.toString(id);
        tempArr.add(str);
        tempArr.add(name);
        tempArr.add(email);

        return tempArr;
    }
}
