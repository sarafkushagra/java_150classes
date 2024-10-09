//Calculating factorial with recursion 
public class recursion1 {
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int s = n * factorial(n-1);
        return s;
    }
    public static void main(String[] args) {
        int n= 5;
        int res = factorial(n);
        System.out.print(res);
        
    }
}
