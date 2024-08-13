package com;

public class ToggleEachWordInString {

    public static void main(String[] args) {
        String str = "      My          Name is KHAN";
        String newStr = str.replaceAll("\\s+", " ").trim();
        String[] words = newStr.split("\\s");
        String toggleWord = "";

        for (String w : words) {
            String ss = "";

            for (char c : w.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    ss =ss+ Character.toLowerCase(c);
                } else {
                    ss += Character.toUpperCase(c);
                }
            }
            toggleWord =toggleWord+ ss + " ";
        }

        // Trim the result to remove the trailing space
        toggleWord = toggleWord.trim();

        System.out.println("-->" + toggleWord);
    }
}
