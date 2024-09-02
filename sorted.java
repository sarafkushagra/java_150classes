// To check whether the array is sorted or not

class sorted {
    public static int sorti(int arr[]){
        for(int i=0;i<(arr.length-1);i++){
            if(arr[i]>arr[i+1]){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int arr[]={2,5,6,3,7};
        int res = sorti(arr);
        if(res==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}