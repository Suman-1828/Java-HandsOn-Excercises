package array;

import java.util.Scanner;

public class elementOccurrence {
    public static void main(String []args){
        int arr[] = {4,4,4,4,4,4,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to check the occurrence:- ");
        int target = sc.nextInt();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("Element found " + count + " times");
    }
}
