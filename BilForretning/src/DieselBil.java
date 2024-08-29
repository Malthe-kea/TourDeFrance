public class DieselBil extends Bil {

    boolean harPartikelfilter;
    int kmPrL;

    public DieselBil(int regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelFilter, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelFilter;
        this.kmPrL = kmPrL;
    }

    public double beregnGrønEjerafgift() {

        double result = 0;
        double udligningsAfgift;
        if (kmPrL <= 20 || kmPrL >= 50) {
            udligningsAfgift = 130;
            result = 330 + udligningsAfgift;
        } else if (kmPrL <= 15 || kmPrL >= 20) {
            udligningsAfgift = 1390;
            result = 1050 + udligningsAfgift;
        } else if (kmPrL <= 10 || kmPrL >= 15) {
            udligningsAfgift = 1850;
            result = 2340 + udligningsAfgift;
        } else if (kmPrL <= 5 || kmPrL >= 10) {
            udligningsAfgift = 2770;
            result = 5500 + udligningsAfgift;
        } else if (kmPrL < 5) {
            udligningsAfgift = 15260;
            result = 10470 + udligningsAfgift;
        }
        if (!harPartikelfilter) {
        result += 1000;
        }
        return result;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
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
