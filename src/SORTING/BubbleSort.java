package SORTING;

public class BubbleSort {

    public static void main(String[] args) {
        // write your code here
        int arr[]={2,1, 3, 6 , 4};
        BubbleSort selection = new BubbleSort();
        selection.bubbleSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public void bubbleSort(int arr[])
    {
        int length=arr.length;
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j+1,j);
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
