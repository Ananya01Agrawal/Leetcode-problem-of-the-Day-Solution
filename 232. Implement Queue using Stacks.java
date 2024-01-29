class MyQueue {
    // Two stacks to implement the queue
    private Deque<Integer> stk1 = new ArrayDeque<>();
    private Deque<Integer> stk2 = new ArrayDeque<>();

    // Constructor for initializing the queues
    public MyQueue() {

    }
    
    // Push operation: Add an element to the queue by pushing it onto the first stack
    public void push(int x) {
        stk1.push(x);
    }
    
    // Pop operation: Remove and return the front element of the queue
    public int pop() {
        // Ensure that stk2 has elements to pop
        move();
        return stk2.pop();
    }
    
    // Peek operation: Return the front element of the queue without removing it
    public int peek() {
        // Ensure that stk2 has elements to peek
        move();
        return stk2.peek();
    }
    
    // Check if the queue is empty
    public boolean empty() {
        // The queue is empty if both stacks are empty
        return stk1.isEmpty() && stk2.isEmpty();
    }

    // Move elements from stk1 to stk2 if stk2 is empty
    private void move() {
        // Move elements only if stk2 is empty
        while (stk2.isEmpty()) {
            // Move elements from stk1 to stk2 until stk1 is empty
            while (!stk1.isEmpty()) {
                stk2.push(stk1.pop());
            }
        }
    }
}
