Subarray with given sum :
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
  
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements from 2nd position to 4th position is 12.
  
------------------------------------------------------------------------------------------------------------------------------------------
  
Solution 1:

Time Complexity : O(n^2)

static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
{
      int i,j,sum=0,f=0;
      ArrayList <Integer> array=new ArrayList<Integer>();
      start:
      for(i=0;i<n;i++)
      {
          sum=arr[i];
          for(j=i+1;j<=n;j++)
          {
              if(sum==s)
              {
                  array.add(i+1);
                  array.add(j);
                  f=1;
                  break start;
              }
              if(sum>s || j==n)
                  break;
              sum+=arr[j];
          }
      }
      if(f==0)
          array.add(-1);
      return array;
}

------------------------------------------------------------------------------------------------------------------------------------------
  
Solution 2:

Time Complexity : O(n)
  
static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
{
      int i,start=0,sum=arr[0],f=0;
      ArrayList <Integer> array=new ArrayList<Integer>();
      for(i=1;i<=n;i++)
      {
          while(sum>s && start<i-1)
          {
              sum=sum-arr[start];
              start++;
          }
          if(sum==s)
          {
              array.add(start+1);
              array.add(i);
              f=1;
              break;
          }
          if(i<n)
              sum=sum+arr[i];
      }
      if(f==0)
          array.add(-1);
      return array;
}


