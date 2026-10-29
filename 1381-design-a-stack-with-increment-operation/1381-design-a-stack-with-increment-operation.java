class CustomStack {
    int[] stackarray;
    int top;
    public CustomStack(int maxSize) {
        stackarray = new int[maxSize];
        top = -1;
    }
    
    public void push(int x) {
        if(top < stackarray.length - 1){
            top++;
            stackarray[top] = x;
        }
    }
    
    public int pop() {
        if(top >= 0){
            return stackarray[top--];
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k, top + 1);
        for(int i = 0; i < limit; i++){
            stackarray[i] += val; 
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */