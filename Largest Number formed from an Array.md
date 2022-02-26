<h2> Largest Number formed from an Array : </h2>
Given a list of non negative integers, arrange them in such a manner that they form the largest number possible.The result is going to be very large, hence return the result in the form of a string.


**Example 1:**

Input: <br />
N = 5 <br />
Arr[] = {3, 30, 34, 5, 9} <br />
Output: 9534330 <br />
Explanation: Given numbers are {3, 30, 34, 5, 9}, the arrangement 9534330 gives the largest value.

**Example 2:**

Input: <br />
N = 4 <br />
Arr[] = {54, 546, 548, 60} <br />
Output: 6054854654 <br />
Explanation: Given numbers are {54, 546, 548, 60}, the arrangement 6054854654 gives the largest value.

------------------------------------------------------------------------------------------------------------------------------------------------------

<h3> Solution : </h3>

Time Complexity : O(NlogN)

```java
String printLargest(String[] arr) 
{
    Arrays.sort(arr, new Comparator<String>(){
        public int compare(String a, String b)
        {
            String n1=a+b;
            String n2=b+a;
            return n2.compareTo(n1);
        }
    });
    String str="";
    int i;
    for(i=0;i<arr.length;i++)
        str+=arr[i];
    return str;
}
```


