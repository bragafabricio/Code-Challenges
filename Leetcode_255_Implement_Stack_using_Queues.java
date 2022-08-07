class MyStack {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();
    private int top;
    
    public MyStack() {
    }
    
    
    public void push(int x) {
        queue1.add(x);
        top = x;
        
    }
    
    public int pop() {
        while (queue1.size() > 1){
            top = queue1.remove();
            queue2.add(top);
        }
        int item = queue1.remove();
        Queue<Integer> tempQueue = queue1;
        queue1 = queue2;
        queue2 = tempQueue;
        
        return item;
        
    }
    
    public int top() {
        return top;
        
    }
    
    public boolean empty() {
        return (queue1.isEmpty());
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

/**
 *Time complexity : O(n). The algorithm dequeues n elements from q1 and enqueues n - 1n−1 elements to q2, 
 * where n is the stack size. This gives 2n - 12n−1 operations.
 *Space complexity : O(1).
 */
