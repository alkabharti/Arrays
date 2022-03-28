<h2> Convert array into Zig-Zag fashion : </h2>
Given an array Arr (distinct elements) of size N. Rearrange the elements of array in zig-zag fashion. The converted array should be in form a < b > c < d > e < f. The relative order of elements is same in the output i.e you have to iterate on the original array only.

**Example 1:**

Input: <br/>
N = 7 <br/>
Arr[] = {4, 3, 7, 8, 6, 2, 1} <br/>
Output: 3 7 4 8 2 6 1 <br/>
Explanation: 3 < 7 > 4 < 8 > 2 < 6 > 1

**Example 2:**

Input: <br/>
N = 4 <br/>
Arr[] = {1, 4, 3, 2} <br/>
Output: 1 4 2 3 <br/>
Explanation: 1 < 4 > 2 < 3

--------------------------------------------------------------------------------------------------------------------------------------------------

<h3> Solution : </h3>

Time Complexity : O(N)

```java
void zigZag(int arr[], int n) 
{
    int i;
    for(i=0;i<n-1;i++)
    {
        if(i%2==0)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        else
        {
            if(arr[i]<arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
}
```

