package pl.sda.t02_d1sob1_rozgrz.s3_loops;

/*
    Napisz metodę, która policzy n-tą potęgę (n >= 0) liczby całkowitej a.
    Parametry metody to: n i a.
*/

public class Zad_02_potegowanie {

    public static long potegowanie(int podstawa, int wykladnik){
        long potega = 1L;
        for (int i=1; i<=wykladnik; i++)
            potega = potega * podstawa;
        return potega;
    }  //potegowanie

    public static void main(String[] args) {
        int a= 5;  // podstawa
        int n= 3;  // wykładnik potęgi
        System.out.println("\n"+a+" do potegi "+n+" daje: "+potegowanie(a,n));
    } //main

} // potegowanie class
