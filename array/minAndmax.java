package array;

public class minAndmax {
    public static void main(String[] args){
        int arr[] = {1,2,3,-4,5,6,7};
        int max = arr[0], min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
