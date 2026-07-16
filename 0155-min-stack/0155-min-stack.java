class MinStack {
    List<Integer>list ; 
    List<Integer>sort ; 

    public MinStack() {
        list = new ArrayList<>(); 
        sort = new ArrayList<>(); 
        
    }
    
    public void push(int value) {
       list.add(value); 

         int index = Collections.binarySearch(sort, value);

        if (index < 0) {
            index = -(index + 1);   // Calculate insertion point
        }

        sort.add(index, value);
        
    }
    
    public void pop() {
        int el = list.get(list.size()-1 ); 
        list.remove(list.size()-1); 
        sort.remove(Integer.valueOf(el)); 

        
    }
    
    public int top() {
        return list.get(list.size()-1); 
        
    }
    
    public int getMin() {
        return sort.get(0); 
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */