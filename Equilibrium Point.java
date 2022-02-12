Equilibrium Point : 
Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
Explanation: For second test case equilibrium point is at position 3 as elements before it (1+3) = elements after it (2+2). 
 

Example 2:

Input:
n = 1
A[] = {1}
Output: 1
Explanation: Since its the only element hence its the only equilibrium point.
  
---------------------------------------------------------------------------------------------------------------------------------------------
  
Solution :

Time Complexity : O(n)
  
public static int equilibriumPoint(long arr[], int n) 
{
    int i,left=0,right=0,res=0;
    for(i=0;i<n;i++)
        right+=arr[i];
    for(i=0;i<n;i++)
    {
        right-=arr[i];
        if(left==right)
            res=i+1;
        left+=arr[i];
    }
    if(res==0)
        return -1;
    else
        return res;
}


