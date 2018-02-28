package isumi.datastruct.stack;

public class App {

    public static void main(String[] args) {
        MyLinkStack<Integer> stack = new MyLinkStack<Integer>();
        for(int i=0;i<10;i++){
            stack.push(i);
        }
        for(int i=0;i<10;i++){
            System.out.println(stack.pop());
        }
    }
}
