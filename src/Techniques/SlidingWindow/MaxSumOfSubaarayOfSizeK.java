package Techniques.SlidingWindow;

import SORTING.BucketSort;

import java.util.ArrayList;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class MaxSumOfSubaarayOfSizeK {
    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> arr= new ArrayList<Integer>(Arrays.asList(2, 1, 3, 5 , 4, 0));
        MaxSumOfSubaarayOfSizeK selection = new MaxSumOfSubaarayOfSizeK();
        int maxElement= selection.maximumSumSubarray( 2, arr, arr.size());
        System.out.println(" max Elemtn "+maxElement);
        int maxElement2= selection.maximumSumSubarrayAdityaVerma( 2, arr, arr.size());
        System.out.println(" max Element Subarray "+maxElement2);

        for(int i=0;i<arr.size();i++)
        {
            System.out.println(" "+arr.get(i));
        }
    }
    static int maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        int i=0,j=0;
        int sum=0;
        int max=0;
        while(j<K)
        {
            sum=sum+Arr.get(j++);
        }
        max=Math.max(max,sum);

        while(j<N)
        {
            sum=sum+Arr.get(j)-Arr.get(i);
            max=Math.max(max,sum);
            j++;
            i++;
        }
        return max;
    }
    static int maximumSumSubarrayAdityaVerma(int K, ArrayList<Integer> Arr, int N){
        int i=0,j=0;
        int sum=0;
        int max=0;

        while(j<N)
        {
            sum=sum+Arr.get(j);
            if(j-i+1<K)
            {
                j++;
            }
            else if(j-i+1==K)
            {
                max= Math.max( max,sum);
                sum = sum - Arr.get(i);
                i++;
                j++;
            }
        }
        return max;
    }

}
