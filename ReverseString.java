public class ReverseString {

    public static void reverseString(char[] s) {
        if (s.equals(" ")) {
            throw new IllegalArgumentException();
        }
        if (s.length == 0) {
            throw new NullPointerException();
        }
        int v = s.length - 1;
        for (int i = 0; i < v; i++) {
            char save = s[i];
            s[i] = s[v];
            s[v] = save;
            v--;
        }
        System.out.println(s);
    }
}
