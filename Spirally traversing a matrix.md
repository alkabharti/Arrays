<h2> Spirally traversing a matrix : </h2>
Given a matrix of size r*c. Traverse the matrix in spiral form.

**Example 1:**

Input: <br />
r = 4, c = 4 <br />
matrix[][] = {{1, 2, 3, 4},<br />
           {5, 6, 7, 8},<br />
           {9, 10, 11, 12},<br />
           {13, 14, 15,16}}<br />
           
Output: <br />
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10<br />
Explanation:
![image](https://user-images.githubusercontent.com/23376002/155830421-f0c44142-c890-4cfa-b8ab-bb6ee8ddc5ae.png)


**Example 2:**

Input:<br />
r = 3, c = 4  <br />
matrix[][] = {{1, 2, 3, 4},<br />
           {5, 6, 7, 8},<br />
           {9, 10, 11, 12}}<br />
           
Output: <br />
1 2 3 4 8 12 11 10 9 5 6 7<br />

Explanation: Applying same technique as shown above, output for the 2nd testcase will be 1 2 3 4 8 12 11 10 9 5 6 7.

----------------------------------------------------------------------------------------------------------------------------------------------

<h3> Solution : </h3>

Time Complexity : O(r*c)

```java
static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
{
    ArrayList<Integer> array=new ArrayList<Integer>();
    int i,start_row=0, start_col=0;
    while(start_row<r && start_col<c)
    {
        for(i=start_col;i<c;i++)
            array.add(matrix[start_row][i]);
        start_row++;
        for(i=start_row;i<r;i++)
            array.add(matrix[i][c-1]);
        c--;
        if(start_row<r)
        {
            for(i=c-1;i>=start_col;i--)
                array.add(matrix[r-1][i]);
            r--;
        }
        if(start_col<c)
        {
            for(i=r-1;i>=start_row;i--)
                array.add(matrix[i][start_col]);
            start_col++;
        }
    }
    return array;
}
```




