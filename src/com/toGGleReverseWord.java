package com;

public class toGGleReverseWord {
    public static void main(String[] args) {
        String str = "      My          Name is KHAN";
        String newStr = str.replaceAll("\\s+", " ").trim();
        String[] words = newStr.split("\\s");
        String toggleWord = "";

        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            String ss = "";

            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    ss += Character.toLowerCase(c);
                } else {
                    ss += Character.toUpperCase(c);
                }
            }

            toggleWord += ss + " ";
        }

        // Trim the result to remove the trailing space
        toggleWord = toggleWord.trim();

        System.out.println("-->" + toggleWord);
    }
}
