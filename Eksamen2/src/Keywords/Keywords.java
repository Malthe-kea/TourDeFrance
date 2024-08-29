package Keywords;

import java.util.ArrayList;

public class Keywords {

    private String name;
    private String description;

    private ArrayList<String> seeAlso = new ArrayList<>();

    public Keywords(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void addToSeeAlso(String input){
        seeAlso.add(input);
    }

}
