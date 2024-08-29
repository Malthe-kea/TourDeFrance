import java.util.Date;
public class Tid {
    public static void main(String[] args) {

       //Date samletTidSidenMidnatISekunder = new Date();
       //samletTidSidenMidnatISekunder.setTime(40);
        int sekund = 30;
        int minut = 12;
        int time = 11;

        //System.out.println((samletTidSidenMidnatISekunder.setTime(40));

        int samletTidSidenMidnatISekunder = ((time * 60 * 60) + (minut * 60) + sekund);
        int tidSidenOpgavensBegyndelse = ( - samletTidSidenMidnatISekunder);



       System.out.println("Der er gået" + " " + samletTidSidenMidnatISekunder + " " + "Siden midnat");//System.out.println("der er gået" + " " + tidSidenOpgavensBegyndelse + " " + "Siden opgavens begyndelse");
    }

}
