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
**Input:**
```java
nums = {1, 2, 3, 4}
target = 5 
```
Iterations:
1. Primeira iteração (i = 0):

nums[i] = 1
complement = target - nums[i] = 5 - 1 = 4
map.containsKey(4): false
→ Adiciona 1 ao mapa: map = {1=0}.
2. Segunda iteração (i = 1):

nums[i] = 2
complement = target - nums[i] = 5 - 2 = 3
map.containsKey(3): false
→ Adiciona 2 ao mapa: map = {1=0, 2=1}.
3. Terceira iteração (i = 2):

nums[i] = 3
complement = target - nums[i] = 5 - 3 = 2
map.containsKey(2): true

```java
return new int[]{map.get(2), 2}; // Retorna {1, 2}
```
