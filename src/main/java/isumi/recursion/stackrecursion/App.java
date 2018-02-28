package isumi.recursion.stackrecursion;

public class App {

    static int theNum;
    static int theAnswer;
    static StackX theStack;
    static int codePart;
    static Params theseParams;

    public static void main(String[] args) {
        theNum = 5;
        recTraingle();
        System.out.println(theAnswer);
    }

    public static void recTraingle(){
        theStack = new StackX(1000);
        codePart = 1;
        while(step() == false){
            ;
        }
    }

    public static boolean step(){
        switch (codePart){
            case 1:
                theseParams = new Params(theNum,6);
                theStack.push(theseParams);
                codePart = 2;
                break;
            case 2:
                theseParams = theStack.peek();
                if(theseParams.n == 1){
                    theAnswer = 1;
                    codePart = 5;
                }else{
                    codePart = 3;
                }
                break;
            case 3:
                Params newParams = new Params(theseParams.n-1,4);
                theStack.push(newParams);
                codePart = 2;
                break;
            case 4:
                theseParams = theStack.peek();
                theAnswer = theAnswer + theseParams.n;
                codePart = 5;
                break;
            case 5:
                theseParams = theStack.peek();
                codePart = theseParams.returnAddress;
                theStack.pop();
                break;
            case 6:
                return true;
        }
        return false;
    }
}
