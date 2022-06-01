package refactoritzacions;


public class ConversorEur_Pound extends Conversor{
    public double euro2Pound (double qty) {
        return qty * 0.89d;
    }

    public double Pound2Euro (double qty) {
        return qty / 0.89d;
    }
}

