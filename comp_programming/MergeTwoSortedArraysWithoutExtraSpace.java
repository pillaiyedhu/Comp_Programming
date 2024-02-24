package comp_programming;

//Merge Two Sorted arrays without extra space
//a=[1,4,5,7]  b=[2,3,6]
//[1,2,3,4,5,6,7]
//a=[1,2,3,4] b=[5,6,7]

import java.util.Arrays;

public class MergeTwoSortedArraysWithoutExtraSpace {
    public static void MergeTwoSortedArray(int[] arr1,int[] arr2){
        int i=arr1.length-1;
        int j=0;
        while(j!=arr2.length-1) {
            if (arr2[j] < arr1[i]) {
                int temp = arr2[j];
                arr2[j] = arr1[i];
                arr1[i] = temp;
            }
            j++;
            i--;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        int[] arr1 = {1,4,5,7};
        int[] arr2 = {2,3,6};

        MergeTwoSortedArray(arr1,arr2);
    }
}
