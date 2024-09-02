// To find the second maximum element in an array

class secondmax {
    public static int result(int arr[]){
        int m = Integer.MIN_VALUE;
        int rm = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > m){
                rm = m;
                m=arr[i];
            }
            else if ((arr[i] > rm)&& arr[i] != m){
                rm=arr[i];
            }
        }
        
        
        return rm;
    }
    
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int arr[] = {10 ,-4,-7,-8,-9,0,-7,6,8,5};
        int res = result(arr);
        System.out.println(res);
    }
}