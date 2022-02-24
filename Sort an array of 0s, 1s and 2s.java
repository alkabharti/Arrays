Sort an array of 0s, 1s and 2s :
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

Example 1:

Input: 
N = 5 arr[]= {0 2 1 2 0}
Output: 0 0 1 2 2
Explanation: 0s 1s and 2s are segregated into ascending order.

Example 2:

Input: 
N = 3 arr[] = {0 1 0}
Output: 0 0 1
Explanation: 0s 1s and 2s are segregated into ascending order.
  
-----------------------------------------------------------------------------------------------------------------------------------------  

  
Solution 1:

Time Complexity : O(N)
  
public static void sort012(int a[], int n)
{
    Arrays.sort(a);
}  

-> Here Time Complexity will be O(NlogN)

-----------------------------------------------------------------------------------------------------------------------------------------  

  
Solution 2:

Time Complexity : O(N)

public static void sort012(int a[], int n)
{
    int i;
    int zero=0,one=0,two=0;
    for(i=0;i<n;i++)
    {
        if(a[i]==0)
            zero++;
        else if(a[i]==1)
            one++;
        else if(a[i]==2)
            two++;
    }
    int k=0;
    for(i=0;i<zero;i++,k++)
        a[k]=0;

    for(i=0;i<one;i++,k++)
        a[k]=1;

    for(i=0;i<two;i++,k++)
        a[k]=2;
}  

-----------------------------------------------------------------------------------------------------------------------------------------  

  
Solution 3:

3 Pointer Algorithm[ Dutch National Flag Algorithm ]
  
 https://www.youtube.com/watch?v=oaVa-9wmpns


  
