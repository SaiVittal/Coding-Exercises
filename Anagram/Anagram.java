package Anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
    private final String word;
    
    public Anagram(String word) {
        this.word = word;
    }
    
    public List<String> match(List<String> strings) {
        char[] wordCharacters = word.toLowerCase().toCharArray();
        Arrays.sort(wordCharacters);
        
        ArrayList<String> res = new ArrayList<>();
        for (String string : strings) {
            if (word.equalsIgnoreCase(string)) {
                continue;
            }
            char[] chars = string.toLowerCase().toCharArray();
            Arrays.sort(chars);
            if (Arrays.equals(wordCharacters, chars)) {
                res.add(string);
            }
        }
        return res;
    }
}
