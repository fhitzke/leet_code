public class LastWord {

    public int lengthOfLastWord(String s) {
        if (s.equals(" ") || s == null) {
            return 0;
        }
        String[] words = s.split(" ");

        if (words.length == 0) {
            return 0;
        }
        String w = words[words.length-1];
        return w.length();
    }
}
