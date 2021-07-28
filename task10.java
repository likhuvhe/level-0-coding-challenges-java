import java.util.*;

class Task10{
    public static void main(String[] args) {
        commonLetters("house", "computers");
        commonLetters("at", "computersa");

    }
    public static void commonLetters(String string1, String string2) {
        Set<String> commons = new HashSet<String>();
        for (int i = 0; i < string2.length(); i++){
            char letterStr2 = string2.charAt(i);
            for (int j = 0; j < string1.length(); j++){
                char letterStr1 = string1.charAt(j);
                if (letterStr2 == letterStr1)
                    commons.add(String.valueOf(letterStr2));
            }
        }
        System.out.println("Common letters: " + String.join(", ", commons));
    }
}