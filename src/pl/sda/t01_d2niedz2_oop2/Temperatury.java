package pl.sda.t01_d2niedz2_oop2;

public class Temperatury {
    private double Fa;  //Temperatura w stopniach Fahrenheita
    private double Ce;  // Temperatura w stopniach Celsjusza


    public double convertToCelsius(double temperatureInFahrenheit){
        return (temperatureInFahrenheit-32)/1.8;
    } //convertToCelsius

    public double convertToFahrenheit(double temperatureInCelsius){
        return temperatureInCelsius*1.8+32;
    } //convertToFahrenheit

    public double getFa() {
        return Fa;
    }

    public void setFa(double fa) {
        Fa = fa;
    }

    public double getCe() {
        return Ce;
    }

    public void setCe(double ce) {
        Ce = ce;
    }



} // class pl.sda.t01_d2niedz2_oop2.Temperatury
