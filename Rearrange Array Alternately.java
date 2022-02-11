Rearrange Array Alternately :
Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively 
i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.

Example 1:

Input:  
N = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1, second max = 5, second min = 2, and so on... Modified array is : 6 1 5 2 4 3.
  
Example 2:

Input:
N = 11
arr[]={10,20,30,40,50,60,70,80,90,100,110}
Output:110 10 100 20 90 30 80 40 70 50 60
Explanation: Max element = 110, min = 10, second max = 100, second min = 20, and so on... Modified array is : 110 10 100 20 90 30 80 40 70 50 60.
  
---------------------------------------------------------------------------------------------------------------------------------------------------
  
Solution :

Time Complexity : O(n)
  
public static void rearrange(long arr[], int n)
{
    int i=0,j=n-1,k=0;
    long array[]=new long[n];
    while(i<n/2 && j>=n/2)
    {
        if(k%2==0)
        {
            array[k]=arr[j];
            j--;
        }
        else
        {
            array[k]=arr[i];
            i++;
        }
        k++;
    }
    if(n%2==0)
        array[n-1]=arr[n/2 - 1];
    else
        array[n-1]=arr[n/2];

    for(i=0;i<n;i++)
        arr[i]=array[i];
  
}


