```java
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
        
```       
