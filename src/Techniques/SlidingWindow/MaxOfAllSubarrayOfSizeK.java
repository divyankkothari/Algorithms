package Techniques.SlidingWindow;


import java.util.ArrayDeque;
import java.util.Deque;

public class MaxOfAllSubarrayOfSizeK {
    public static void main(String[] args) {
        // write your code here
        int arr[]= new int[]{-2, 1, -3, 5 , 4, 0};
        MaxOfAllSubarrayOfSizeK selection = new MaxOfAllSubarrayOfSizeK();
        int[] maxElement= selection.slidingMaximum( arr, 2);
//        System.out.println(" max Elemtn "+maxElement);

        for(int i=0;i<maxElement.length;i++)
        {
            System.out.println(" "+maxElement[i]);
        }
    }
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public int[] slidingMaximum(int[] nums, int k) {
            int len = nums.length;
            if (len == 0 || k > len) {
                return new int[0];
            }
            int[] ans = new int[len - k + 1];
            int idx = 0;
            Deque<Integer> deque = new ArrayDeque<>();

            int i=0,j=0;
            while(j < nums.length)
            {
                while(!deque.isEmpty() && nums[deque.peekLast()] < nums[j] )
                    deque.pollLast();
                if(j-i+1 < k)
                {
                    deque.offer(j);
                    j++;
                }
                else if(j-i+1 == k)
                {
                    deque.offer(j);
                    ans[idx++] = nums[deque.peekFirst()];
                    if(deque.peekFirst() == i)
                    {
                        deque.pollFirst();
                    }
                    i++;
                    j++;
                }
            }
            return ans;
        }
    }


