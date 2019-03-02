package pl.sda.t01_d1sob1_datatypes;

public class Zad_1A_8_ComputerPrice {
/*
    W osobnej klasie ComputerPrice, w metodzie main()
    napisz program obliczający cenę komputera na podstawie jego części.
    Program ma wypisać na konsolę osobno cenę samego komputera:
    płyta główna, procesor, pamięć RAM, dysk twardy
    i osobno cenę komputera i monitora.
    W cenie należy uwzględnić podatek VAT = 23%.
*/

    public static void main(String[] args){
        // write your code here

        double mbNetto = 432,
                procNetto = 1799,
                ramNetto=399,
                hddNetto = 573,
                monNetto = 935;
        double kompNetto = mbNetto+procNetto+ramNetto+hddNetto;
        System.out.println("\nPodzespoły komputera (w cenach netto):");
        System.out.println("Płyta główna: "+mbNetto+" zł");
        System.out.println("Procesor: "+procNetto+" zł");
        System.out.println("Pamięć RAM: "+ramNetto+" zł");
        System.out.println("Dysk twardy: "+hddNetto+" zł");
        System.out.println("==========================");
        System.out.println("Komputer (netto): "+kompNetto+" zł");
        System.out.println("Monitor (netto): "+monNetto+" zł");
        System.out.println("==========================");
        System.out.println("Komputer (brutto) "+1.23*kompNetto+" zł");
        System.out.println("Monitor (brutto): "+1.23*monNetto+" zł");
        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println("Zestaw komputer+monitor (brutto): "+1.23*(kompNetto+monNetto)+" zł");
    } // main

}  //class Zad_1A_8_CPrice
