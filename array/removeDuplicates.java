package array;

public class removeDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        // Loop through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // If current element is the same as the next one, skip it
            if (arr[i] == arr[i + 1]) {        //if(arr[i]!=arr[i+1]){sout(arr[i]+" ");}
                continue;
            }
            // Print the current element
            System.out.print(arr[i] + " ");
        }
        // Print the last element, since it won't be printed in the loop
        System.out.print(arr[arr.length - 1]);
    }
}