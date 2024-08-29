package Dream;

import java.time.LocalDate;

public class Dream {

    private LocalDate date;
    private int durationInMinutes;

    private Type type;

    public Dream(int durationInMinutes, Type type){

        this.date = LocalDate.now();
        this.durationInMinutes = durationInMinutes;
        this.type = type;
    }

    public boolean isPleasant(){
        if (type == Type.NIGHTMARE){
            return false;
        }
        else if (type == Type.PROBLEMSOLVING && durationInMinutes < 10){
            return true;
        } else if (type == Type.NEUTRAL && durationInMinutes > 10){
            return true;
        } else {
            return false;
        }
    }

    public LocalDate getDate() {
        return date;
    }
}
