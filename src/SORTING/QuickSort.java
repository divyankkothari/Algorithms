package SORTING;

public class QuickSort {
    public static void main(String[] args) {
        // write your code here
        int arr[]={2, 1, 3, 5 , 4, 0};
        QuickSort selection = new QuickSort();
        selection.quickSort(arr,0,arr.length);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }
    public void quickSort(int arr[], int start, int end)
    {
        if(start<end) {
            int q = partition(arr, start, end);
            quickSort(arr, start, q);
            quickSort(arr, q+1, end);
        }
        }
    public int partition(int arr[], int start, int end)
    {
        System.out.println(start+" "+ end+" 1st "+arr[0]);
        int i=start;
        int j=-1;
        while(i!=end)
        {
            if(arr[i]<arr[end-1])
            {
                if(j!=-1)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j++;
                    continue;
                }
                i++;
            }
            else{
                if(j==-1)
                {
                    j=i;
                    i++;
                    continue;
                }
                i++;

            }
        }
        int temp=arr[end-1];
        arr[end-1]=arr[j];
        arr[j]=temp;
        return j;
    }
}
