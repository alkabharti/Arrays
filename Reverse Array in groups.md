<h2> Reverse array in groups : </h2>
Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K. 

**Example 1:**

Input: <br />
N = 5, K = 3 <br />
arr[] = {1,2,3,4,5} <br />
Output: 3 2 1 5 4 <br />
Explanation: First group consists of elements 1, 2, 3. Second group consists of 4,5.
 

**Example 2:**

Input: <br />
N = 4, K = 3 <br />
arr[] = {5,6,8,9} <br />
Output: 8 6 5 9

-------------------------------------------------------------------------------------------------------------------------------------------------
<h3>Solution 1 : </h3>

Time Complexity : O(N)

```java 
void reverseInGroups(ArrayList<Integer> arr, int n, int k) 
    {
        int i;
        for(i=0;i<n;i+=k)
        {
            int start=i;
            int end=Math.min(i+k-1,n-1);
            while(start<=end)
            {
                int temp=arr.get(start);
                arr.set(start,arr.get(end));
                arr.set(end,temp);
                start++;
                end--;
            }
        }
        
    }
```

-------------------------------------------------------------------------------------------------------------------------------------------------


<h3>Solution 2 : </h3>

Time Complexity : O(N)

```java 
void reverseInGroups(ArrayList<Integer> arr, int n, int k) 
    {
        int i;
        for(i=0;i<n;i+=k)
        {
            int start=i;
            int end=Math.min(i+k-1,n-1);
            while(start<=end)
            {
                Collections.swap(arr,start,end);
                start++;
                end--;
            }
        }
        
    }
```

![image](https://user-images.githubusercontent.com/23376002/155639387-9bd48de7-720e-4b0e-9f4f-bc8d5fb745d9.png)


