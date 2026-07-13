class MyStack {
    Queue<Integer>queue; 

    public MyStack() {
        queue = new LinkedList<>(); 
        
    }
    
    public void push(int x) {
        queue.add(x); 
        
    }
    
    public int pop() {
        Queue<Integer>temp = new LinkedList<>(); 
        int ret =0; 
        while(!queue.isEmpty()){
            if(queue.size() ==1 ){
                ret = queue.remove(); 
                break ; 
            }
            temp.add(queue.remove()); 
        }
        
        while( !temp.isEmpty()){
            queue.add(temp.remove()); 
        }
        return ret ; 
        
    }
    
    public int top() {
    Queue<Integer>temp = new LinkedList<>(); 
       int ret =0;
        while(!queue.isEmpty()){
            if( queue.size() == 1 ){
                ret = queue.peek(); 
            }
            temp.add(queue.remove()); 
        }
         
        while( !temp.isEmpty()){
            queue.add(temp.remove()); 
        }
        return ret ;
        
    }
    
    public boolean empty() {
        return queue.isEmpty(); 
        
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