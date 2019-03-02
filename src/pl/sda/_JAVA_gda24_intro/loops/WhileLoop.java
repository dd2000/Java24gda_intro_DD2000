package pl.sda._JAVA_gda24_intro.loops;

public class WhileLoop {
    public static void main(String[] args) {
        printLettersInReverseOrder(100);
        //sumTillLimit(3, 5);
    }

    private static void printLettersInReverseOrder(int limit) {
        char c = 'z';
        while(limit > 0) {
            if(c < 'a') {
                return; // warunek kończący pętlę w "połowie"
            }
            System.out.print(c + " ");
            c--;
            limit--;//limit jest zmienną lokalną możemy modyfikować ją dowoli bez obaw że zmienimy argument przekazany do metody
        }
    }

    private static void sumTillLimit(int maxNumber, int limit) {
        int sum = 1;
        int lastNumber = 1;
        while(true) {
            lastNumber++;
            sum+= lastNumber;

            if(sum >= limit){
                break;
            }

            if(lastNumber == maxNumber) {
                break;
            }
        }

        System.out.println("sum = " + sum);
        System.out.println("lastNumber = " + lastNumber);
    }
}
