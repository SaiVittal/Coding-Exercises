package pangram;

public class pangram {
    public boolean isPangram(String input) {
        boolean[] marked = new boolean[26];
 
        String lowerCaseSentence = input.toLowerCase();
 

        for (int i = 0; i < lowerCaseSentence.length(); i++) {
            char ch = lowerCaseSentence.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                marked[ch - 'a'] = true;
            }
        }
 
        for (boolean m : marked) {
            if (!m) {
                return false;
            }
        }
 
        return true;
    }
}
