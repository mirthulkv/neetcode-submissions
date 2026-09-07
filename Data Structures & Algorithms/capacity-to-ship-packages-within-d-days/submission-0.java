class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int sum = 0;
        int maxWeight = 0;

        for (int containers : weights) {
            maxWeight = Math.max(maxWeight, containers);
            sum = sum + containers;
        }

        int l = maxWeight;
        int r = sum;

        while (l <= r) {

            int m = l + (r - l) / 2;

            int i = 0;
            int cap = 0;
            int count = 1;

            while (i < weights.length) {

                if (cap + weights[i] <= m) {
                    cap = cap + weights[i];
                    i++;
                }
                else {
                    cap = 0;
                    count++;
                }
            }

            if (count <= days) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }

        return l;
    }
}