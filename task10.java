import java.util.*;

class Task10{
    public static void main(String[] args) {
        commonLetters("house", "computers");
        System.out.println("===");
        commonLetters("at", "computersa");
        System.out.println("===");
        commonLetters("Eckard", "Berry");

    }
    public static void commonLetters(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        Set<String> commons = new LinkedHashSet<String>();
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