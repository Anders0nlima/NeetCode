# ✅ VALID-ANAGRAMA

## 💡 **How does this work?**
```java
char[] sSort = s.toCharArray(); 
char[] tSort = t.toCharArray(); 
Arrays.sort(sSort); 
Arrays.sort(tSort); 
return Arrays.equals(sSort, tSort);
```

🧪 **Example using the strings "dog" and "god"**

1️⃣ **Conversion to character array:**

s = "dog" → sSort = ['d', 'o', 'g']  
t = "god" → tSort = ['g', 'o', 'd']  

2️⃣ **Array ordering:**

sSort = ['d', 'o', 'g'] → order → ['d', 'g', 'o']  
tSort = ['g', 'o', 'd'] → order → ['d', 'g', 'o']  

3️⃣ **Comparison of arrays:**

sSort = ['d', 'g', 'o']  
tSort = ['d', 'g', 'o']  

The two are equal, so the function returns true.

# ✅ Two Sum
## 💡 **How does this work?**
### HashMap
Array: {2, 7, 11, 15}
Target: 29

Initially, the map is empty: {}.

First number (nums[0] = 2):

Complement: 29 - 2 = 27

Check: 27 is not on the map.

Add: {2=0}.

Second number (nums[1] = 7):

Complement: 29 - 7 = 22

Check: 22 is not on the map.

Add: {2=0, 7=1}.

Third number (nums[2] = 11):

Complement: 29 - 11 = 18

Check: 18 is not on the map.

Add: {2=0, 7=1, 11=2}.

Fourth number (nums[3] = 15):

Complement: 29 - 15 = 14

Check: 14 is not on the map.

Add: {2=0, 7=1, 11=2, 15=3}

29 doesn't exist so returns empty.
