**Equilibrium Point :**
<br />
Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Example 1:

Input: <br />
n = 5 <br />
A[] = {1,3,5,2,2} <br />
Output: 3 <br />
Explanation: For second test case equilibrium point is at position 3 as elements before it (1+3) = elements after it (2+2). 
 

Example 2:

Input: <br />
n = 1 <br />
A[] = {1} <br />
Output: 1 <br />
Explanation: Since its the only element hence its the only equilibrium point.
  
---------------------------------------------------------------------------------------------------------------------------------------------
  
**Solution :**

Time Complexity : O(n)

```java  
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
```

![image](https://user-images.githubusercontent.com/23376002/155478167-1d28c622-4ba7-4c3a-8325-c915161f4193.png)


