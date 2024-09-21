package array;

public class mergeArray {
    public static void main(String[] args){
        int arr[] = {4,3,2,1};
        int arr1[] = {8,7,6,5};
        int mergedArr[] = new int[arr.length+arr1.length];

        for(int i=0;i<arr.length;i++){
            mergedArr[i] = arr[i];
        }
        for(int i=0;i<arr1.length;i++){
            mergedArr[arr.length+i] = arr1[i];
        }
        bubbleSort(mergedArr);

        for(int num : mergedArr){
            System.out.print(num + " ");
        }
    }
    public static void bubbleSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
