package isumi.recursion;

public class TrainngleNum {

    public static int getTraingleNum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        return sum;
    }

    public static int recursionTraingle(int n){
        if(n == 1){
            return 1;
        }else{
            return n + recursionTraingle(n-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(getTraingleNum(10));
        System.out.println(recursionTraingle(10));
    }


}
