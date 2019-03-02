package pl.sda.t02_d1sob1_rozgrz.s1encapsulation.task.item;

class ItemUtil {
    String truncate(String text, int maxLength) {
        if (text == null || text.length() < maxLength) {
            return text;
        }
        return text.substring(0, maxLength);
    }
}
