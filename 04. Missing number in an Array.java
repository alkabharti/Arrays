Missing number in array :
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
  
Input:
N = 5
A[] = {1,2,3,5}
Output: 4
  
---------------------------------------------------------------------------------------------------------------------------------
  
Solution 1 :

Time Complexity : O(n)
  
## xor_total = 1 ^ 2 ^ 3 ^ 4 ^ 5
## xor_array = 1 ^ 2 ^ 3 ^ 5
## xor_total ^ xor_array = (1 ^ 2 ^ 3 ^ 4 ^ 5) ^ (1 ^ 2 ^ 3 ^ 5)
##                       = (1 ^ 1) ^ (2 ^ 2) ^ (3 ^ 3) ^ 4 ^ (5 ^ 5)
##                       = 0 ^ 0 ^ 0 ^ 4 ^ 0  (a ^ a = 0)
##                       = 4                  (a ^ 0 = a)
  
  
int MissingNumber(int array[], int n) 
{
    int i,xor_total=0,xor_array=0; 
    for(i=1;i<=n;i++)
    {
        xor_total=xor_total ^ i;
    }
    for(i=0;i<n-1;i++)
    {
        xor_array=xor_array ^ array[i];
    }
    return (xor_total ^ xor_array);
}

---------------------------------------------------------------------------------------------------------------------------------
  
Solution 2 :

Time Complexity : O(n)
  
int MissingNumber(int array[], int n) 
{
    int sum=(n*(n+1))/2;
    int i,s=0;
    for(i=0;i<n-1;i++)
    {
        s=s+array[i];
    }
    return sum-s;
}



