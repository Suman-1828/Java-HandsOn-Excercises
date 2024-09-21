package array;

public class rotateArrayLeft {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int k = 2;
        for(int i = 0 ; i<k; i++){
            rotateLeft(arr);
        }
        for(int i : arr){
            System.out.println(i + " ");
        }
    }
    public static void rotateLeft(int[] arr){
        int n = arr.length;
        int firstElement = arr[0];

        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = firstElement;
    }
}
