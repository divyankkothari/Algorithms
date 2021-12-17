package SORTING;

public class BucketSort {
    public static void main(String[] args) {
        // write your code here
        int arr[]={2, 1, 3, 5 , 4, 0};
        BucketSort selection = new BucketSort();
        int maxElement=10;
        selection.bucketSort(arr, maxElement);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }

    private void bucketSort(int[] arr, int maxElement) {
    }


}
