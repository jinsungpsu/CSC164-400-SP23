public class CompareTo {
    public static void main(String[] args) {
        String w1 = "abc";
        String w2 = "abd";

        if (w1.compareTo(w2) < 0) {
            // means w1 < w2
        } else if (w1.compareTo(w2) > 0) {
            // means w1 > w2
        } else if (w1.compareTo(w2) == 0) {
            // means they're same
            // which also means
            // this is equivalent to w1.equals(w2)
        }
    }
}
