package Motherboard;

public class Main {
    public static void main(String[] args) {
        MotherBoard motherBoard = new MotherBoard(new SataDrive("Drive1"));
        MotherBoard motherBoard2 = new MotherBoard(new SataDrive("Drive1"), new SataDrive("drive 2"));
        MotherBoard motherBoard3 = new MotherBoard(new SataDrive("Drive3"), new SataDrive("drive 2"), new SataDrive("drive 3"));
        MotherBoard motherBoard4 = new MotherBoard(new SataDrive("Drive3"), new SataDrive("drive 2"), new SataDrive("drive 4"));

        motherBoard3.connectedSataDrives();


    }
}
