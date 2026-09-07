class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = 0;

        // Find maximum pile
        for (int pile : piles) {
            r = Math.max(r, pile);
        }

        int res = r;

        while (l <= r) {

            int k = l + (r - l) / 2;

            long hours = 0;

            for (int pile : piles) {
                hours += (pile + k - 1) / k;
            }

            if (hours <= h) {
                // k works, but maybe a smaller k also works
                res = k;
                r = k - 1;
            }
            else {
                // k is too slow
                l = k + 1;
            }
        }

        return res;
    }
}