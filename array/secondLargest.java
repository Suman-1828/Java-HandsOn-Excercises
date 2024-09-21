package array;

public class secondLargest {
    public static void main(String[] args){
        int arr[] = {2,3,4,1,5,8,9,12,15,10,15,10,16};

        int largest=Integer.MIN_VALUE;

        int secondLargest=Integer.MIN_VALUE;

        for(int num : arr){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            } else if (num>secondLargest && num != largest){
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);
    }
}
