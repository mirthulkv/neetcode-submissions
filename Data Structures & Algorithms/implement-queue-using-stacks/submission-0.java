class MyQueue {

    Stack<Integer> s1;

    public MyQueue() {
        s1 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s1.size() == 1) {
            return s1.pop();
        }

        int top = s1.pop();

        int result = pop();

        s1.push(top);

        return result;
    }

    public int peek() {
        if (s1.size() == 1) {
            return s1.peek();
        }

        int top = s1.pop();

        int result = peek();

        s1.push(top);

        return result;
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */