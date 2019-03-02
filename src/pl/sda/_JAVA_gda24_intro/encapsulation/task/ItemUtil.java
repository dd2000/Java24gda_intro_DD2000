package pl.sda._JAVA_gda24_intro.encapsulation.task;

class ItemUtil {
    String truncate(String text, int maxLength) {
        if (text == null || text.length() < maxLength) {
            return text;
        }
        return text.substring(0, maxLength);
    }
}
