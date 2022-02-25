<h2> Sort an array of 0s, 1s and 2s : </h2>
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

**Example 1:**

Input: 
N = 5 arr[]= {0 2 1 2 0}
Output: 0 0 1 2 2
Explanation: 0s 1s and 2s are segregated into ascending order.

**Example 2:**

Input: 
N = 3 arr[] = {0 1 0}
Output: 0 0 1
Explanation: 0s 1s and 2s are segregated into ascending order.
  
-----------------------------------------------------------------------------------------------------------------------------------------  

  
<h3> Solution 1: </h3>

Time Complexity : O(NlogN)

```java  
public static void sort012(int a[], int n)
{
    Arrays.sort(a);
}  
```
-----------------------------------------------------------------------------------------------------------------------------------------  

  
<h3> Solution 2: </h3>

Time Complexity : O(N)

```java
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
```
-----------------------------------------------------------------------------------------------------------------------------------------  

<h3> Solution 3: (Dutch national flag Algorithm (DNF))</h3> 

Time Complexity : O(N)

```java  
public static void sort012(int a[], int n)
{
    int i;
    int low=0, mid=0, high=n-1;
    while(mid<=high)
    {
        if(a[mid]==0)
        {
            int temp=a[low];
            a[low]=a[mid];
            a[mid]=temp;
            low++;
            mid++;
        }
        else if(a[mid]==1)
        {
            mid++;
        }
        else if(a[mid]==2)
        {
            int temp=a[mid];
            a[mid]=a[high];
            a[high]=temp;
            high--;
        }
    }
}
```

![image](https://user-images.githubusercontent.com/23376002/155654144-99d068d1-2079-4044-8ec7-cb803f2309aa.png)



  
