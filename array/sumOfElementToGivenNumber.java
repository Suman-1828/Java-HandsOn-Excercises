package array;

public class sumOfElementToGivenNumber {
    public static void main(String[] args){
        int arr[] = {1,2,6,4,2,3,5,0,5,7};
        int sum = 7,count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == sum){
                    count++;
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
        System.out.println(count);
    }
}
