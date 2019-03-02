package pl.sda._JAVA_gda24_intro.exceptions;

// do stworzenia klasy, ktora moze byc pozniej uzywana jako wyjatek wystarczy rozszerzenie klas Exception lub RuntimeException lub ich klas pochodnych
public class NumberIsLessThanZeroException extends RuntimeException {
    public NumberIsLessThanZeroException(String message) {
        super(message);
    }
}
