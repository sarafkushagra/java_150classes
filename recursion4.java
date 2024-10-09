//Calculating power using recursion

public class recursion4 {
    public static int calc(int n,int power){
        if (power==0){
            System.out.println(1);
            return 1;
        }
        return n * calc(n,power-1);
        

    }
    public static void main(String[] args) {
        int n = 2;
        int power = 5;
        int res= calc( n, power);
        System.err.println(res);
        
    }
}
