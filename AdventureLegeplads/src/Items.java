import java.util.Scanner;
public class Items {
    public class SplitArray {
Scanner input = new Scanner(System.in);
        boolean gameIsRunning = true;
        String take;
        String objekt;

        String navn =

        //her splitter jeg ved mellemrum som angivet i parameteren i navn.split()
        String[] navneArray = navn.split(" ");


        public void playerInteractionWithItems(){
            objekt = navneArray[1];
            if (navneArray.length == 1) {
                while (gameIsRunning) {
                }
                switch (navneArray[0]) {
                    case "1" -> {
                        switch (navneArray[1]) {
                            case "take", "t" -> {

                            }
                            case "drop", "d" -> {

                            }
                        }
                    }
                    case "2"->{

                    }
                }
            }
        }
    }

}
