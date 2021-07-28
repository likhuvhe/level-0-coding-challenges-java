import java.util.*;

class Task09 {
    public static void main(String[] args) {
        printVowels("Umuzi");
    }
    public static void printVowels(String word) {
        word = word.toLowerCase();
        Set<String> vowels = new HashSet<String>();
        for (int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            if (isVowel(letter))
                vowels.add(String.valueOf(letter));
        }
        System.out.println("vowels: " + String.join(", ", vowels));
    }
    public static boolean isVowel(char letter) {
        if  (letter == 'a' || letter == 'A' ||
             letter == 'e' || letter == 'E' ||
             letter == 'i' || letter == 'I' ||
             letter == 'o' || letter == 'O' ||
             letter == 'u' || letter == 'U'
        ){
            return true;
        }else
            return false;
        
    }
}