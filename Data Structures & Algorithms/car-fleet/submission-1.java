class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[] posspeed = new int[target];
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < position.length ; i++) {
            posspeed[position[i]] = speed[i];
        }

        for (int i = target-1; i >= 0; i--) {
            if (posspeed[i] == 0)
                continue;

            double  time = (double)(target - i) / posspeed[i];
            if (stack.isEmpty()) {
                stack.push(time);
            } else {
                if (stack.peek() >= time) {
                    continue;
                }
                if (stack.peek() < time) {
                    stack.push(time);
                }
            }
        }
        return stack.size();
    }
}
