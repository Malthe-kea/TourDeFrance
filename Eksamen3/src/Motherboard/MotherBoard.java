package Motherboard;

public class MotherBoard {
    private SataDrive drive1;
    private SataDrive drive2;
    private SataDrive drive3;
    private SataDrive drive4;

    public MotherBoard(SataDrive drive1){
       this.drive1 = drive1;
    }
    public MotherBoard(SataDrive drive1, SataDrive drive2){
        this.drive1 = drive1;
        this.drive2 = drive2;

    }
    public MotherBoard(SataDrive drive1, SataDrive drive2, SataDrive drive3){
        this.drive1 = drive1;
        this.drive2 = drive2;
        this.drive3 = drive3;
    }
    public MotherBoard(SataDrive drive1, SataDrive drive2, SataDrive drive3, SataDrive drive4){
        this.drive1 = drive1;
        this.drive2 = drive2;
        this.drive3 = drive3;
        this.drive4 = drive4;
    }

    public void connectedSataDrives(){

    }
}
