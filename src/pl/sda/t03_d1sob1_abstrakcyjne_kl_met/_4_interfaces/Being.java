package pl.sda.t03_d1sob1_abstrakcyjne_kl_met._4_interfaces;

public interface Being {

    public int MAX_AGE = 100;


    public String getAge(); // sygnatura metody getAge()

    default public Boolean isAlive(int age){
        if (age > MAX_AGE)
            return true;
        else return false;
    } // isAlive()

}  // interface Being
