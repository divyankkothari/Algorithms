package SORTING;

public class BubbleSort {
    public void bubbleSort(int arr[])
    {
        int length=arr.length;
        for(int i=length-1;i>=0;i--)
        {
            for(int j=1;j<length;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    swap(arr,i,j);
                }
            }
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
