G Solution 1 

O(NlogN)

```java
public static int kthSmallest(int[] arr, int l, int r, int k) 
{ 
    Arrays.sort(arr);
    return arr[k-1];
} 
```
