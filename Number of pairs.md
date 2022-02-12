**Number of pairs :**
Given two arrays X and Y of positive integers, find the number of pairs such that x^y > y^x (raised to power of) 
where x is an element from X and y is an element from Y.

Example 1:

Input: <br />
M = 3, X[] = [2 1 6] 
N = 2, Y[] = [1 5]
Output: 3
Explanation: 
The pairs which follow xy > yx are as such: 2^1 > 1^2,  2^5 > 5^2 and 6^1 > 1^6 .

Example 2:

Input: 
M = 4, X[] = [2 3 4 5]
N = 3, Y[] = [1 2 3]
Output: 5
Explanation: 
The pairs for the given input are 2^1 > 1^2 , 3^1 > 1^3 , 3^2 > 2^3 , 4^1 > 1^4 , 5^1 > 1^5 

--------------------------------------------------------------------------------------------------------------------------------------

**Solution 1: (Brute Force Algorithm)**

Time Complexity : O(MxN)

```java
static long countPairs(int x[], int y[], int M, int N)
{
  long pairs = 0;
  int i,j
    for (i = 0; i < M; i++)
        for (j = 0; j < N; j++)
            if (Math.pow(x[i], y[j]) > Math.pow(y[j], x[i]))
                pairs++;
    return pairs;
}
```

**Solution 2: **

Time Complexity : O((N + M)log(N))

```java
class Solution
{
    static long countPairs(int x[], int y[], int M, int N)
    {
        Arrays.sort(x);
        Arrays.sort(y);
        int zero=0,one=0,two=0,three=0,four=0;
        int i;
        long pairs=0;
        for(i=0;i<N;i++)
        {
            switch(y[i])
            {
                case 0: zero++;
                        break;
                case 1: one++;
                        break;
                case 2: two++;
                        break;
                case 3: three++;
                        break;
                case 4: four++;
                        break;
            }
        }
        for(i=0;i<M;i++)
        {
            if(x[i]==0)
                continue;
            else if (x[i]==1)
                pairs+=zero;
            else if (x[i]==2)
            {
                int index=getIndex(y,N,2);
                if(index!=-1)
                    pairs+=N-index;
                pairs+=zero+one-three-four; 
            }
            else
            {
                int index=getIndex(y,N,x[i]);
                if(index!=-1)
                    pairs+=N-index;
                pairs+=zero+one;
                if(x[i]==3)
                    pairs+=two;
            }
        }
        return pairs;
    }
    static int getIndex(int[] y,int N, int e)
    {
        int low = 0;
        int high = N-1;
        int index = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(y[mid] > e){
                index = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return index;
    }
}
```

![image](https://user-images.githubusercontent.com/23376002/153711220-dc8af863-835d-4c73-9d1e-28c42509909e.png)




