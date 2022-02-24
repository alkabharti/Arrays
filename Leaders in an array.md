**Leaders in an array :** Given an array A of positive integers. Your task is to find the leaders in the array.
An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

Example 1:

Input:<br />
n = 6 <br />
A[] = {16,17,4,3,5,2}<br />
Output: 17 5 2<br />
Explanation: The first leader is 17 as it is greater than all the elements to its right.  Similarly, the next leader is 5. 
The right most element is always a leader so it is also included.
 

Example 2:

Input:<br />
n = 5<br />
A[] = {1,2,3,4,0}<br />
Output: 4 0<br />

-------------------------------------------------------------------------------------------------------------------------------------------------

Solution 1 :

Time Complexity : O(n^2)

-------------------------------------------------------------------------------------------------------------------------------------------------

Solution 2 :

Time Complexity : O(n)

```java
static ArrayList<Integer> leaders(int arr[], int n)
{
    ArrayList<Integer> array=new ArrayList<Integer>();
    ArrayList<Integer> ans=new ArrayList<Integer>();
    int leader=arr[n-1];
    int i;
    array.add(leader);
    for(i=n-2;i>=0;i--)
    {
        if(arr[i]>=leader)
        {
            leader=arr[i];
            array.add(leader);
        }
    }
    for(i=array.size()-1;i>=0;i--)
        ans.add(array.get(i));
    return ans;
}
```

![image](https://user-images.githubusercontent.com/23376002/155481981-e7671737-074e-4f80-8fb8-cc6bed940c29.png)

-------------------------------------------------------------------------------------------------------------------------------------------------

Solution 3 :

Time Complexity : O(n)

```java
static ArrayList<Integer> leaders(int arr[], int n)
{
    ArrayList<Integer> array=new ArrayList<Integer>();
    int leader=arr[n-1];
    int i;
    array.add(leader);
    for(i=n-2;i>=0;i--)
    {
        if(arr[i]>=leader)
        {
            leader=arr[i];
            array.add(0,leader); //Adding element always at 0th index
        }
    }
    return array;
}
```
