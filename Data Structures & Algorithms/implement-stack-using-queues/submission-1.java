class MyStack
 {
        Queue<Integer>q;
    public MyStack()
     {
        
              q=new LinkedList<>();
        
    }
    
    public void push(int x) {
        int size=q.size();
        q.add(x);
        for(int i=1;i<=size;i++)
        {
            q.add(q.peek());
            q.poll();
        }
        
    }
    
    public int pop()
     {
        int x=q.peek();
        q.poll();
        return x;
        
    }
    
    public int top() 
    {
        return q.peek();
    }
    
    public boolean empty()
     {
        return q.size()==0?true:false;
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