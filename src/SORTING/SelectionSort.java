package SORTING;

public class SelectionSort {
    public static void main(String[] args) {
        // write your code here
        int arr[]={2,1, 3, 5 , 4};
        SelectionSort selection = new SelectionSort();
        selection.selectionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public void selectionSort(int arr[])
    {
        int large=0;
        int length=arr.length;
        for(int i=0;i<length;i++)
        {
            large=0;
            for(int j=0;j<length-i;j++)
            {
                if(arr[j]>arr[large])
                {
                    large=j;
                }
            }
//          System.out.println(arr[large]+ " i "+i+" large "+ large);
            swap(arr,length-i-1, large);
        }
    }
    public void swap(int arr[],int i,int j){
        if(i==j)
        {
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
