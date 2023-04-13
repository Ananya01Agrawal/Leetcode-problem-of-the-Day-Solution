class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushed.length; i++) {
            if (!stack.isEmpty() && stack.peek() == popped[j]) {
                for (int k = j; k < popped.length; k++) {
                    if (!stack.isEmpty() && popped[k] == stack.peek()) {
                        stack.pop();
                        j++;
                    } else break;
                }
            }
            stack.push(pushed[i]);
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == popped[j]) {
                stack.pop();
                j++;
            } else break;
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
