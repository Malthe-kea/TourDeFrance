import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> listeAfTal = new ArrayList<>();
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        HashSet<Integer> stringHashSet = new HashSet<>(listeAfTal);

        stringIntegerHashMap.put("Danmark", 4);
        stringIntegerHashMap.put("Holland", 2);
        stringIntegerHashMap.put("Köfte", 123190);
        stringIntegerHashMap.put("Soft-ice", -4);
        stringIntegerHashMap.put("Kikærtemel", 1312);
        stringIntegerHashMap.put("Nimbuskosten", 100);



        listeAfTal.add(1);
        listeAfTal.add(7);
        listeAfTal.add(6);
        listeAfTal.add(5);
        listeAfTal.add(4);
        listeAfTal.add(3);
        listeAfTal.add(2);
        listeAfTal.add(2);
        listeAfTal.add(2);
        listeAfTal.add(2);
        listeAfTal.add(2);
        listeAfTal.add(2);

        System.out.println(listeAfTal);

        var tal = new LinkedHashSet<>(listeAfTal);

        tal.add(1);
        tal.add(2);
        tal.add(3);
        tal.add(4);
        tal.add(4);
        tal.add(4);
        tal.add(4);
        tal.add(4);

        System.out.println(tal);
        System.out.println(stringIntegerHashMap);

        for(int i : tal){
            System.out.println(i);
        }
        for (int i : stringHashSet){
            System.out.println(i);
        }
    }
}
