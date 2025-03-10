import java.util.HashSet;

public class PangramCheck {
    public static boolean isPangram(String s) {
        s = s.toLowerCase(); 
        HashSet<Character> set = new HashSet<>();

       
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }
        return set.size() == 26; // If all 26 letters are present, it's a pangram
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        if (isPangram(s)) {
            System.out.println("The given string is a Pangram.");
        } else {
            System.out.println("The given string is NOT a Pangram.");
        }
    }
}
