package search;

import java.util.HashSet;
import java.util.Set;

public class Panangram {
    public static void main(String[] args) {
        String input = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(input));
    }
    public static boolean checkIfPangram(String sentence) {
//        char[] chars = sentence.toLowerCase().toCharArray();
//        Set<Character> set = new HashSet<>();
//        for(char letter : chars) {
//            if (letter >= 'a' && letter <= 'z') {
//                set.add(letter);
//            }
//        }
//        return set.size() == 26;
        if(!(sentence.length() > 25))
            return false;
        for(int i=0;i<26;i++) {
            if(!sentence.contains("" + (char)('a'+i))) {
                return false;
            }
        }
        return true;
    }
}

