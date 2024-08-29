package Raflebæger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Raflebæger {
    Random rnd = new Random();

    private int terning1;
    private int terning2;
    private int antalTerninger;
    public Raflebæger(int antalTerninger){
        this.antalTerninger = antalTerninger;
    }

    public int ryst(){
        this.terning1 = rnd.nextInt(1,6);
        this.terning2 = rnd.nextInt(1,6);
        return terning1 + terning2;
    }

    public int se(){
        return terning2 + terning1;
    }


}
