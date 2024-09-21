package array;

public class missingNumber {
    public static void main(String[] args){
        int arr[] = {1,6,2,8,3,4,7}; //n-1 element
        int n = arr.length+1;  // Since the array has n-1 elements, n is arr.length + 1
        int expectedSum = n*(n+1) / 2;
        int actualSum = 0;
//        for(int num : arr){
//            actualSum += num;
//        }
        for(int i=0;i<n-1;i++){
            actualSum += arr[i];
        }
        System.out.println(expectedSum-actualSum);
    }
}
