import java.util.*;

class Solution {

    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public int maxFreqSum(String s) {
        HashMap<Character, Integer> hsv = new HashMap<>(); // vowels
        HashMap<Character, Integer> hsc = new HashMap<>(); // consonants

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                hsv.put(ch, hsv.getOrDefault(ch, 0) + 1);
            } else {
                hsc.put(ch, hsc.getOrDefault(ch, 0) + 1);
            }
        }

        // Get max frequency from both maps
        int maxVowelFreq = getMaxFreq(hsv);
        int maxConsonantFreq = getMaxFreq(hsc);

        // Return sum of max frequencies (as method name suggests)
        return maxVowelFreq + maxConsonantFreq;
    }

    // Helper method to get maximum frequency from a map
    private int getMaxFreq(HashMap<Character, Integer> map) {
        int maxFreq = 0;
        for (int freq : map.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }
        return maxFreq;
    }
}
