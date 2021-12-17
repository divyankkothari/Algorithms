package Techniques.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

// https://www.geeksforgeeks.org/first-negative-integer-every-window-size-k/
public class FirstNegativeIntegerInWindowK {
    public static void main(String[] args) {
        // write your code here
        long arr[]= new long[]{-2, 1, -3, 5 , 4, 0};
        FirstNegativeIntegerInWindowK selection = new FirstNegativeIntegerInWindowK();
        long[] maxElement= selection.printFirstNegativeInteger( arr, arr.length , 2);
//        System.out.println(" max Elemtn "+maxElement);

        for(int i=0;i<maxElement.length;i++)
        {
            System.out.println(" "+maxElement[i]);
        }
    }
    public long[] printFirstNegativeInteger(long A[], int N, int K) {
        long l[] = new long[N];
        long result[] = new long[N - K + 1];
        int i = 0, j = 0;
        int p = 0;
        int q = 0;
        int r = 0;

        while (j < N) {
            if (A[j] < 0) {
                l[p++] = A[j];
            }

            if (j - i + 1 < K) {
                j++;
            } else if (j - i + 1 == K) {

                result[r++] = l[q];
                if (l[q] == A[i]) {
                    q++;
                }
                j++;
                i++;
            }
        }

        return result;
    }
}
