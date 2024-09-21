package array;

public class reverseArray {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
//        int revArr[] = new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            revArr[i] = arr[arr.length - 1 - i];
//        }
//        for(int i=0;i<revArr.length;i++){
//            System.out.println(revArr[i]);
//        }
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
