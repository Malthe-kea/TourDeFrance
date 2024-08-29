package Raflebæger;

import java.util.Random;

public class Raflebæger {
    private int antalTerninger = 0;
    private Random rnd = new Random();
    private int terning1 = 0;
    private int terning2 = 0;

    public Raflebæger(int antalTerninger){
        this.antalTerninger = antalTerninger;
    }

    public int ryst(){
        int samledeAntalØjne = 0;

        terning1 = rnd.nextInt(1,6);
        terning2 = rnd.nextInt(1,6);

        return samledeAntalØjne = terning1 + terning2;
    }

    public void se(){
        System.out.println(terning1);
        System.out.println(terning2);
    }

}
