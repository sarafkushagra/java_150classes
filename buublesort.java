
public class buublesort {
    public static void main(String[] args) {
        int arr[]={24, 18, 38, 43, 14, 40, 1, 54};
        int n=8;
        for(int i=1;i<n;i++){
            boolean check = false;
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    check = true;
                }
                }
                if(check == false){
                    break;
                }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}