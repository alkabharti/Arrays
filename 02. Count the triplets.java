Count the triplets :
Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
  
Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: 2
Explanation: There are 2 triplets: 1 + 2 = 3 and 3 + 2 = 5 

-----------------------------------------------------------------------------------------------------------------------------------
  
Solution 1 :

Time Complexity : O(n^3)
  
int countTriplet(int arr[], int n) 
{
    int i,j,count=0;
    ArrayList<Integer> array=new ArrayList<Integer>();
    for(i=0;i<n;i++)
        array.add(arr[i]);
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(array.contains(arr[i]+arr[j]))
                count++;
        }
    }
    return count;
}

Q -> What if I had run the inner loop also : for(j=0;j<n;j++). Would it affect the count? -> Would the triplets be repeated?

-----------------------------------------------------------------------------------------------------------------------------------

Solution 2 :

Time Complexity : O(n^2)
  
int countTriplet(int arr[], int n) 
{
    int i,j,count=0;
    HashSet<Integer> hashset=new HashSet<Integer>();
    for(i=0;i<n;i++)
        hashset.add(arr[i]);
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(hashset.contains(arr[i]+arr[j]))
                count++;
        }
    }
    return count;
}

-----------------------------------------------------------------------------------------------------------------------------------

Solution 3 :

Time Complexity : O(n^2)
  
int countTriplet(int arr[], int n) 
{
    int i,j,k,count=0;
    for(j=n-1;j>=0;j--)
    {
        i=0;
        k=j-1;
        while(i<k)
        {
            if(arr[j]==arr[i]+arr[k])
                count++;
            else if(arr[j] > (arr[i]+arr[k]))
                i++;
            else
                k--;
        }
    }
    return count;
}
  
  
  
