package SORTING;

public class RadixSort {
    public static void main(String[] args) {
        // write your code here
        int arr[]={211, 122, 333, 544 , 564, 770};
        RadixSort selection = new RadixSort();
        selection.radixSort(arr, 3);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }

    }
    public int getDigit(int arr, int d)
    {

        while(d!=1)
        {
            arr=arr/10;
            d--;
        }

        return arr%10;
    }

    public void radixSort(int arr[], int digit)
    {
        int maxElement=10, in =1;
        while(in<=digit) {
            int countArr[] = new int[maxElement];
            int outArr[] = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                countArr[getDigit(arr[i], in)]++;
            }
            for (int i = 1; i < maxElement; i++) {
                countArr[i] = countArr[i] + countArr[i - 1];
            }
            for(int i=arr.length-1; i>=0; i--)
            {
                outArr[(countArr[getDigit(arr[i], in)])-1] = arr[i];
                countArr[getDigit(arr[i], in)]=countArr[getDigit(arr[i], in)]-1;
            }
            for(int i=arr.length-1; i>=0; i--)
            {
                arr[i] = outArr[i];
//                System.out.println(in+ "digit === "+arr[i]);

            }
            in++;
        }
    }

}
