package pl.sda.t03_d1sob1_abstrakcyjne_kl_met._4_interfaces;

//    Utwórz interfejs Animal oraz dodaj do niego sygnatury metod: getName() i speak().
//
//    Utwórz kilka różnych implementacji interfejsu Animal
//            po jednym dla: ptaków, ssaków, ryb, gadów, owadów.


public interface Animal extends Being {

    public String getName();
    public String speek();

} // interface Animal
