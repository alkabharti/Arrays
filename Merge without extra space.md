```java
Merge Without Extra Space :
Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. 
Merge them in sorted order without using any extra space. 
Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.

Input: 
n = 4, arr1[] = [1 3 5 7] 
m = 5, arr2[] = [0 2 6 8 9]

Output: 
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]

Explanation: After merging the two non-decreasing arrays, we get, 0 1 2 3 5 6 7 8 9.

--------------------------------------------------------------------------------------------------------------------
  
Solution :

public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int i=n-1,j=0;
        while(i>=0 && j<m)
        {
            if(arr1[i]>arr2[j])
            {
                long temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                i--;
            }
            else
                j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
```

![image](https://user-images.githubusercontent.com/23376002/153550681-5581c42c-692b-4747-a822-41c8fc007590.png)

