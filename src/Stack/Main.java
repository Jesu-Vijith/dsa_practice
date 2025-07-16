package Stack;


//pop push peek isEmpty
class DynamicStack{
    protected int[] stack;
    private static final int DEFAULT_SIZE=10;

    DynamicStack(){
        this.stack=new int[DEFAULT_SIZE];
    }
    DynamicStack(int size){
        this.stack=new int[size];
    }
    int ptr=-1;

    public void push(int x){
        if(isFull()) {
            int[] temp = new int[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
        }
        ptr++;
        stack[ptr]=x;
    }

    private boolean isFull() {
        return ptr==stack.length-1;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int ans=stack[ptr];
        ptr--;
        return ans;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return stack[ptr];
    }

    public boolean isEmpty(){
        return ptr<0;
    }

    public void displayStack(){
        System.out.print("STACK: ");
        for(int i=0;i<=ptr;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }

}


public class Main {
    public static void main(String[] args) throws Exception {
        DynamicStack stack=new DynamicStack(5);
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.push(1);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.displayStack();
//        System.out.println(stack.pop());
//        stack.displayStack();
//        System.out.println(stack.peek());
//        stack.displayStack();
    }
}
