package SORTING;

public class CountingSort {
    public static void main(String[] args) {
        // write your code here
        int arr[]={2, 1, 3, 5 , 4, 0};
        CountingSort selection = new CountingSort();
        int maxElement=10;
        selection.countSort(arr, maxElement);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }

    public void countSort(int arr[], int maxElement)
    {
        int countArr[] = new int[maxElement];

        for(int i=0; i<arr.length; i++)
        {
            countArr[arr[i]]++;
        }

        int k=0;
        for(int i=0; i<maxElement; i++)
        {
            while(countArr[i]-->0) {
                arr[k++] = i;
            }
        }
    }

}
