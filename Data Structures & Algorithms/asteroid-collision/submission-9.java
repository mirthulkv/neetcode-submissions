class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            boolean destroyed = false;

            while (!stack.isEmpty() &&
                   stack.peek() > 0 &&
                   asteroid < 0) {

                int top = stack.peek();

                if (top < -asteroid) {
                    // Top asteroid explodes
                    stack.pop();
                }
                else if (top == -asteroid) {
                    // Both explode
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else {
                    // Current asteroid explodes
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }
        int n=stack.size();

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[n-1-i] = stack.pop();
        }

        return result;
    }
}