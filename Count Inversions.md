**Count Inversions :**
Given an array of integers. Find the Inversion Count in the array. 

_Inversion Count:_ For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

Example 1:

Input: <br />
N = 5, arr[] = {2, 4, 1, 3, 5} <br />
Output: 3 <br />
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).

Example 2:

Input: 
N = 5, arr[] = {2, 3, 4, 5, 6}<br />
Output: 0<br />
Explanation: As the sequence is alreadysorted so there is no inversion count.

Example 3:

Input: <br />
N = 3, arr[] = {10, 10, 10} <br />
Output: 0 <br />
Explanation: As all the elements of array are same, so there is no inversion count.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

**Solution 1 : (Brute Force Algorithm)**

Time Complexity : O(N^2)

```java
static long inversionCount(long arr[], long N)
{
    long count = 0;    
    for (int i = 0; i < (int)N - 1; i++)
        for (int j = i + 1; j < (int)N; j++)
            if (arr[i] > arr[j])
                count++;
 
        return count;
}
```

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

**Solution 2 : (Enhance Merge Sort)**

Time Complexity : O(NLogN)

```java
class Solution
{
    static long inversionCount(long arr[], long N)
    {
        long[] temp=new long[(int)N];
        long count=mergesort(arr,temp,0,N-1);
        return count;
    }
    static long mergesort(long[] arr, long[] temp, long start, long end)
    {
        long count=0;
        if(start<end)
        {
            long mid = (start+end)/2;
            count+=mergesort(arr,temp,start,mid);
            count+=mergesort(arr,temp,mid+1,end);
            count+=merge(arr,temp,start,mid+1,end);
        }
        return count;
    }
    static long merge(long[] arr, long[] temp, long left, long mid, long right)
    {
        int i,j,k;
        long count=0;
        i=(int)left;
        j=(int)mid;
        k=(int)left;
        while(i<=mid-1 && j<=right)
        {
            if(arr[i] <= arr[j])
                temp[k++]=arr[i++];
            else
            {
                temp[k++]=arr[j++];
                count+=mid-i;
            }
        }
        while(i<=mid-1)
            temp[k++]=arr[i++];
        while(j<=right)
            temp[k++]=arr[j++];
        for(i=(int)left;i<=(int)right;i++)
            arr[i]=temp[i];
        return count;
    }
}

```


