<h2> Last index of One : </h2>
Given a string S consisting only '0's and '1's,  find the last index of the '1' present in it.

**Example 1:**

Input: <br />
S = 00001 <br />
Output: 4 <br />
Explanation: Last index of  1 in given string is 4.

**Example 2:**

Input: 0 <br />
Output: -1 <br />
Explanation: Since, 1 is not present, so output is -1.

-------------------------------------------------------------------------------------------------------------------------------------

<h3> Solution : </h3>

Time Complexity : O(N)

```java
public int lastIndex( String s) 
{
    int i,f=-1;
    for(i=s.length()-1;i>=0;i--)
    {
        if(s.charAt(i)=='1')
        {
            f=i;
            break;
        }
    }
    return f;
}
```

