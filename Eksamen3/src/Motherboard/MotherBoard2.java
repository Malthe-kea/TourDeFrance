package Motherboard;

import java.util.ArrayList;

public class MotherBoard2 {
    private SataDrive drive1;
    private SataDrive drive2;
    private SataDrive drive3;
    private SataDrive drive4;

    private ArrayList<SataDrive> listeAfDrives = new ArrayList<>();

    public MotherBoard2(SataDrive drive1) {
        listeAfDrives.add(drive1);
    }

    public MotherBoard2(SataDrive drive1, SataDrive drive2) {
        listeAfDrives.add(drive1);
        listeAfDrives.add(drive2);

    }

    public MotherBoard2(SataDrive drive1, SataDrive drive2, SataDrive drive3) {
        listeAfDrives.add(drive1);
        listeAfDrives.add(drive2);
        listeAfDrives.add(drive3);
    }

    public MotherBoard2(SataDrive drive1, SataDrive drive2, SataDrive drive3, SataDrive drive4) {
        listeAfDrives.add(drive1);
        listeAfDrives.add(drive2);
        listeAfDrives.add(drive3);
        listeAfDrives.add(drive4);
    }

    public ArrayList<SataDrive> connectedSataDrives() {
        ArrayList<SataDrive> tempListOfDrives = new ArrayList<>();
        for (SataDrive s : listeAfDrives) {
            tempListOfDrives.add(s);
        }
        return tempListOfDrives;
    }
}
