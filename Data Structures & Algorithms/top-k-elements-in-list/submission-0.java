class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }

        int size = map.size();

        int[] key = new int[size];
        int[] freq = new int[size];

        int index = 0;

        // Store keys and frequencies
        for (int x : map.keySet()) {
            key[index] = x;
            freq[index] = map.get(x);
            index++;
        }

        // Bubble sort based on frequency
        for (int i = 0; i < size - 1; i++) {

            for (int j = 0; j < size - i - 1; j++) {

                if (freq[j] < freq[j + 1]) {

                    int temp = freq[j];
                    freq[j] = freq[j + 1];
                    freq[j + 1] = temp;

                    temp = key[j];
                    key[j] = key[j + 1];
                    key[j + 1] = temp;
                }
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++)
            ans[i] = key[i];

        return ans;
    }
}