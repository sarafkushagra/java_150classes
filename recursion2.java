//print sum of array
public class recursion2 {
    public static int sum(int[] arr,int n,int s,int su)
    {
        if(s==n){
            return su;
        }
        su+=arr[s];
        return sum(arr,n,s+1,su);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int res = sum(arr,n ,0,0);
        System.out.print(res);
    }
}
