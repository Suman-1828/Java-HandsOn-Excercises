package array;

public class duplicateElement {
    public static void main(String[] arge){
        int arr[] = {1,2,3,3,4,4,2,5,5,6,1,6};
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
