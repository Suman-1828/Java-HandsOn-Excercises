package array;

import java.util.Arrays;

public class positiveAndNegative {
    public static void main(String []args){
        int arr[] = {1,2,3,4,5,6,-1,-4,-6,-2,0,8,4,5,2};
        rearrange(arr);
        // Print the rearranged array
        for(int i : arr){
            System.out.print(i + " ");
        }

    }

    // Function to rearrange the array with sorted positive and negative numbers alternately
    public static void rearrange(int arr[]){
        // Separate the positive and negative numbers
        int[] positives = Arrays.stream(arr).filter(x -> x >= 0).toArray();
        int[] negatives = Arrays.stream(arr).filter(x -> x < 0).toArray();
        // Sort both arrays
        Arrays.sort(positives);
        Arrays.sort(negatives);
        // Merge them alternatively
        int i = 0, posIndex = 0, negIndex = 0;
// Alternate between positive and negative numbers
        while (posIndex<positives.length && negIndex < negatives.length){
            arr[i++] = positives[posIndex++];
            arr[i++] = negatives[negIndex++];
        }
// If there are remaining positive numbers, add them to the array
        while(posIndex<positives.length){
            arr[i++] = positives[posIndex++];
        }
// If there are remaining negative numbers, add them to the array
        while(negIndex<negatives.length){
            arr[i++] = negatives[negIndex++];
        }
    }
}
