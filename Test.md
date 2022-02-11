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

![image](https://user-images.githubusercontent.com/23376002/153539878-0ef4aab8-65d0-4b63-a38b-bcf0639f88e0.png)

