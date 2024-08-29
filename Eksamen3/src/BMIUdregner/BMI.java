package BMIUdregner;

public class BMI {

    private double height;
    private double weight;

    public BMI (double height, double weight){
        this.height = height;
        this.weight = weight;
    }

    public double calculate(){
     return weight/(height* height);
    }

    public boolean isUnderWeight(){
        return calculate() <= 18.5;

    }
    public boolean isNormalWeight(){
        return calculate() >= 18.5 && calculate() <= 25.0;
    }
    public boolean isOverWeight(){
        return calculate() >= 25.0;
    }
}
