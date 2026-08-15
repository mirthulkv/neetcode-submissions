class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> count = new HashMap<>();

        int res = 0;
        int l = 0;
        int maxf = 0;

        for (int r = 0; r < s.length(); r++) {

            // Add current character
            char ch = s.charAt(r);

            count.put(ch, count.getOrDefault(ch, 0) + 1);

            // Update highest frequency
            maxf = Math.max(maxf, count.get(ch));

            // If too many replacements are needed,
            // shrink the window
            while ((r - l + 1) - maxf > k) {

                char leftChar = s.charAt(l);

                count.put(leftChar, count.get(leftChar) - 1);

                l++;
            }

            // Current window is valid
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}