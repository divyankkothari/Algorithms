package SORTING;

public class MergeSort {
    public static void main(String[] args) {
        // write your code here
        int arr[]={2, 1, 3, 5 , 4, 0};
        MergeSort selection = new MergeSort();
        selection.mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }

    public static void merge(int[] arr, int start, int middle, int end){
        int temp[] = new int[end-start+1];
        int i=start, j =middle+1, k=0;
        while(i<=middle && j<=end )
        {
            if(arr[i]>arr[j])
            {
                temp[k++]=arr[j++];
            }
            else
                temp[k++] = arr[i++];
        }
        while(i<=middle)
        {
            temp[k++]=arr[i++];
        }
        while(j<=end)
        {
            temp[k++]=arr[j++];
//            System.out.println("j="+ temp[k-1]);
        }
//        System.out.println("aa");
        for(i = start; i <= end; i++) {
            arr[i] = temp[i - start];
//            System.out.print(arr[i]+"b");
        }
//        System.out.println();
    }
    public void mergeSort(int arr[], int start, int end)
    {
        if (start<end)
        {
            int m=start+(end-start)/2;
            mergeSort(arr, start, m);
            mergeSort(arr, m+1,end);
            merge(arr,start,m,end);
        }



    }
}
