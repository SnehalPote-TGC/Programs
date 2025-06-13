package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class MaximunMinimumRepeatedCharacter {

    public static void main(String[] args) {
        String s = "snehal pote your are";
        HashMap<Character, Integer> hm = new HashMap<>();

        char[] c = s.toCharArray();
        for (char ch : c) {
            if (ch != ' ') { // Ignore spaces
                if (hm.containsKey(ch)) {
                    hm.put(ch, hm.get(ch) + 1);
                } else {
                    hm.put(ch, 1);
                }
            }
        }

        int maxCount = Integer.MIN_VALUE;
        char maxChar = ' ';
        int minCount = Integer.MAX_VALUE;
        char minChar = ' ';

        for (Map.Entry<Character, Integer> me : hm.entrySet()) {
            if (me.getValue() > maxCount) {
                maxCount = me.getValue();
                maxChar = me.getKey();
            }
            if (me.getValue() < minCount) {
                minCount = me.getValue();
                minChar = me.getKey();
            }
        }

        System.out.println("Maximum occurring character: '" + maxChar + "' with count " + maxCount);
        System.out.println("Minimum occurring character: '" + minChar + "' with count " + minCount);
    }
}
