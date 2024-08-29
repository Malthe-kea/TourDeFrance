package StudentOgUser;

import java.util.ArrayList;

public class User implements DataObject{
    private int id;
    private String name;
    private String userName;

    public User(int id, String name, String userName){
        this.id = id;
        this.name = name;
        this.userName = userName;
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public ArrayList<String> getData() {
        ArrayList<String> tempArr = new ArrayList<>();
        String str = Integer.toString(id);
        tempArr.add(str);
        tempArr.add(name);
        tempArr.add(userName);
        return tempArr;
    }
}
