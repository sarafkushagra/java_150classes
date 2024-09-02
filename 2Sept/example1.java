// package 2Sept;

public class example1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("Original Array");
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+ ",");
        }
        System.out.println();
        arr[1]=10;
        System.out.println("Modified array");
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+ ",");
        }
    }
}
