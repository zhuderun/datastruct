package isumi.recursion.stackrecursion;

public class StackX {
    private int maxSize;
    private Params[] stackArray;
    private int top;

    public StackX(int size){
        this.maxSize = size;
        stackArray = new Params[maxSize];
        top = -1;
    }

    public void push(Params param){
        stackArray[++top] = param;
    }

    public Params pop(){
        return stackArray[top--];
    }

    public Params peek(){
        return stackArray[top];
    }

}
