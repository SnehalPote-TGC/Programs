package StringPrograms;

public class OccurrenceOfVowelsAndConsonants {

    public static void main(String[] args) {
        int vowelsCount = 0;
        int consonantCount = 0;
        String str = "Occurrence OF character in a string";

        char[] chars = str.toLowerCase().toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue; // already counted

            freq[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }

            if (chars[i] != ' ' && Character.isLetter(chars[i])) {
                System.out.println("Character --> " + chars[i] + " Occurrence --> " + freq[i]);

                if (isVowel(chars[i])) {
                    vowelsCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("\nTotal Unique Vowels: " + vowelsCount);
        System.out.println("Total Unique Consonants: " + consonantCount);
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
