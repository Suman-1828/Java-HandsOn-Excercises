package array;

public class rotateArrayRight {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int k = 8;
        //rotate the ayyar by k times
        for(int i=0; i<k;i++){
            rotateRight(arr);
        }
        //print rotated array
        for(int i : arr){
            System.out.println(i + " ");
        }
    }
    //function to rotate the array right by one position
    public static void rotateRight(int[] arr){
        int n = arr.length;
        int lastElement = arr[n-1]; // store last element
        // shift all element one position to the right
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement; // last element to the first
    }
}
