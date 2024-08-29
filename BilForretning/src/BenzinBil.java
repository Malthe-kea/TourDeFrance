public class BenzinBil extends Bil {

    int oktanTal;
    int kmPrL;

    public BenzinBil(int regNr, String mærke, String model, int årgang, int antalDøre, int oktanTal, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;
    }

    public double beregnGrønEjerafgift() {
        double result = 0;
        if (kmPrL <= 20 || kmPrL >= 50)
            result = 330;
        else if (kmPrL <= 15 || kmPrL >= 20) {
            result = 1050;
        } else if (kmPrL <= 10 || kmPrL >= 15) {
            result = 2340;
        } else if (kmPrL <= 5 || kmPrL >= 10) {
            result = 5500;
        } else if (kmPrL < 5) {
            result = 10470;
        }
        return result;
    }

    public int getOktanTal() {
        return oktanTal;
    }

    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "BenzinBil{" +
                "regNr=" + regNr +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                ", antalDøre=" + antalDøre +
                '}';
    }
}
