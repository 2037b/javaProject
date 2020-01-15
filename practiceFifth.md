# ThreadLocal原理以及优缺点

1. ThreadLocal关键点：
- 数据存储
  当线程调用threadLocal对象的set(Object value)方法时，数据并不是存储在ThreadLocal对象中，而是存储在Thread对象中，这也是ThreadLocal的由来，具体存储在线程对象的threadLocals属性中，其类型为ThreadLocal.ThreadLocalMap。
  
- ThreadLocal.ThreadLocalMap，Map结构，即键值对，键为threadLocal对象，值为需要存储到线程上下文的值(threadLocal#set)方法的参数。

2. ThreadLocal局限性：
ThreadLocal无法在父子线程之间传递--内容保存在线程对象中，子线程无法继承父线程的内容。

# HashMap和TreeMap

TreeMap<K,V>的Key值是要求实现java.lang.Comparable，所以迭代的时候TreeMap默认是按照Key值升序排列的；TreeMap的实现也是基于红黑树结构。HashMap<K,V>的Key值实现散列hashCode()，分布是散列的均匀的，不支持排序，数据结构主要是桶（数组），链表或红黑树。  
所以，查询的时候使用HashMap，增加、快速创建的时候使用TreeMap。

# final、finally、finalize三者区别

final修饰变量、方法和类；  
finally 和try-catch一起使用；  
finalize在垃圾回收器清理对象之前调用，此方法已被弃用；

# 冒泡排序

```java
public void BubbleSort(int[] arr){
	for(int i=0;i<arr.length-1;i++){
		for(int j=i;j<arr.length-1+i;j++){
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
```

# 选择排序

```java
public void SelectionSort(int[] arr){
	for(int i=0;i<arr.length-1;i++){
		int min=i;
		for(int j=i+1;j<arr.length;j++){
			if(arr[min]>arr[j]){
        min=j;
			}
			if(min!=i){
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
	}
}
```

# 二分法查找

```java
public int BinarySearch(int[] arr,int target){
	int high=arr.length-1,low=0;
	while(low<=high){
		int middle=(high+low)/2;
		if(arr[middle]>target)
		high=middle-1;
		if(arr[middle]<target)
		low=middle+1;
		if(arr[middle]==target)
		return middle;
	}
	return -1;
}
```

# HashMap和HashTable有什么不同

&#160; &#160; &#160; &#160; 线程安全性不同，HashMap的方法都没有使用synchronized关键字修饰，都是非线程安全的，而Hashtable的方法几乎都是被synchronized关键字修饰的。但是，当我们需要HashMap是线程安全的时，怎么办呢？我们可以通过Collections.synchronizedMap(hashMap)来进行处理，亦或者我们使用线程安全的ConcurrentHashMap。ConcurrentHashMap虽然也是线程安全的，但是它的效率比Hashtable要高好多倍。因为ConcurrentHashMap使用了分段锁，并不对整个数据进行锁定。 
