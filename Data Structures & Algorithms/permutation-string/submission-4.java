class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
        }

        int l = 0;

        for (int r = 0; r < s2.length(); r++) {

            count2[s2.charAt(r) - 'a']++;

            if (r - l + 1 > s1.length()) {
                count2[s2.charAt(l) - 'a']--;
                l++;
            }

            if (Arrays.equals(count1, count2)) {
                return true;
            }
        }

        return false;
    }
}