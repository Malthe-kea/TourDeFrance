package Legeplads;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> intArr = new ArrayList<>();
        Object[] array = intArr.toArray();

        FileWriter fw = new FileWriter("Testigennigengng.txt");



        String[] strList = {"hej", "med", "dig"};
        Integer[] intArray = {1,4,11,5231,2541,512,323,1,5};

        int intArrayLength = intArray.length;

        String strValue = strList[1];

        String str = "Sangsuinsugbogg";

        System.out.println(str.charAt(4));

        System.out.println(strValue);
        System.out.println(intArrayLength);

        Arrays.sort(intArray);

        for (Integer i : intArray){
                System.out.println(i);
            }

        try {
            fw.write(Arrays.toString(intArray));
            fw.close();
        } catch (Exception e) {
            System.out.println("yooo det virker ikke!");
        }
        }
    }

