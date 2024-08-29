public class Main {

    public static void main(String[] args) {
        Venue pumpehuset = new Venue("Pumpehuset", 650, 200, "københavn", false);
        Venue headquarters = new Venue("Headquarters", 120, 100, "Aarhus", true);
        Venue studenterhuset = new Venue("Studenterhuset", 300, 200, "Aalborg", true);
        Venue studenterhuset2 = new Venue("Studenterhuset", 150, 100, "København", false);
        Venue arkaden = new Venue("Arkaden", 200, 150, "Odense", false);
        Venue månen = new Venue("Månen", 20, 750, "Haderslev", true);
        Venue vaterland = new Venue("Vaterland", 80, 100, "Oslo", false);
        Venue musikhuzet = new Venue("Musikhuzet", 200, 120, "Rønne", false);
        Venue tobakken = new Venue("Tobakken", 650, 250, "Esbjerg", true);
        Venue voxhall = new Venue("Voxhall", 350, 200, "Aarhus", true);

        Tourplan tourplan = new Tourplan();

        pumpehuset.setName("ikke pumpehuset");


        System.out.println(tourplan.checkIfJylland(pumpehuset));
        System.out.println(tourplan.checkIfJylland(headquarters));
        System.out.println(tourplan.checkIfJylland(studenterhuset));
        System.out.println(tourplan.checkIfJylland(studenterhuset2));
        System.out.println(tourplan.checkIfJylland(arkaden));
        System.out.println(tourplan.checkIfJylland(månen));
        System.out.println(tourplan.checkIfJylland(vaterland));
        System.out.println(tourplan.checkIfJylland(musikhuzet));
        System.out.println(tourplan.checkIfJylland(tobakken));
        System.out.println(tourplan.checkIfJylland(voxhall));

        System.out.println();

        System.out.println("CURRENT AVAILABLE TOURPLAN: \n");
        System.out.println(tourplan.getTourplan());

    }
}
