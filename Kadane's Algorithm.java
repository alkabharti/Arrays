Kadane's Algorithm :
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

Example 1:  

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
  
  
Example 2:

Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation: Max subarray sum is -1 of element (-1)  


-----------------------------------------------------------------------------------------------------------------------------------
  
Solution 1 :

Time Complexity : O(n)
  
long maxSubarraySum(int arr[], int n)
{
    int i;
    long current=arr[0],max=arr[0];
    for(i=1;i<n;i++)
    {
        current=Math.max(current+arr[i],arr[i]);
        max=Math.max(max,current);
    }
    return max;
}

-----------------------------------------------------------------------------------------------------------------------------------
  
Solution 2 :

Time Complexity : O(n)
  

  
  
  
