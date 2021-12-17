package SORTING;

public class CountingSortStable {
    public static void main(String[] args) {
        // write your code here
        int arr[]={2, 1, 3, 5 , 4, 0, 9, 8, 8, 8};
        CountingSortStable selection = new CountingSortStable();
        selection.countSortStable(arr,10);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }

    }

    private void countSortStable(int[] arr, int maxElement) {

        int countArr[] = new int[maxElement];
        int outArr[] = new int[arr.length];

        for(int i=0; i<arr.length; i++)
        {
            countArr[arr[i]]++;
        }

        for(int i=1; i<maxElement; i++)
        {
            countArr[i] = countArr[i]+countArr[i-1];
        }
        for(int i=arr.length-1; i>=0; i--)
        {
            outArr[(countArr[arr[i]])-1] = arr[i];
            countArr[arr[i]]=countArr[arr[i]]-1;
        }
        for(int i=arr.length-1; i>=0; i--)
        {
            arr[i] = outArr[i];
        }
    }
}
