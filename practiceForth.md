# 为什么不能根据返回类型区分重载？

返回类型不是方法签名的一部分，所以，不嫩个有两个名字相同、参数类型也相同却有不同返回类型的方法。

# 数据库脏读，幻读，不可重复读的sql语句

1. **脏读** ：一个事务读到另外一个事务还没有提交的数据。
2. **幻读** ：一个事务先后读取一个范围的记录，但两次读取的记录数不同。
3. **不可重复读** ：一个事务先后读取同一条记录，但两次读取的数据不同。

# mysql数据库的默认事务的隔离级别是什么

**Repeated Read（可重读）：**Mysql 默认使用这个隔离级别，它保证了同一事务在不同实例在并发读取数据的时候看到的是同一数据。但是会出现**“幻读“**情况，就是在事务执行过程中别的事务又在其范围内插入一条新的数据，导致同一事务两次实例同一查询所显示的数据不相同。InniDB和Falcon存储引擎通过多版本并发控制解决了这个问题，好像是通过添加间隙锁，防止插入，但也有可能导致死锁的情况发生。

# jdbc对事物的处理步骤

一项事务是由一条或是多条表达式所组成的一个不可分割的工作单元。通过提交commit()或是回退rollback()来结束事务的操作，jdbc自动commit。

# 通过反射获取和设置对象私有字段的值

```java
// 得到对象所有私有属性
Field[] fields = obj.getClass().getDeclaredFields();
for(Field field:fields){
// 获取私有字段
field.get(obj);
// 设置私有字段的值
field.set(obj,string);
}
```

# 两个队列模拟堆栈结构

```java
		    String[] arr={"a","b","c","d","e"};
        Queue<String> queue1=new LinkedList<>();//第一个队列
        Queue<String> queue2=new LinkedList<>();//第二个队列
        System.out.print("进栈： ");
        //往第一个队列添加元素
        for(String a:arr){
            queue1.offer(a);
            System.out.print(a+" ");
        }
        System.out.println();
        //第一个队列依次加入 ArrayList 集合之中
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.addAll(queue1);
        //倒叙将集合里面的数据装进第二个队列
        for (int i=arrayList.size()-1;i>=0;i--){
            queue2.offer(arrayList.get(i));
        }
        System.out.print("出栈： ");
        for(String a2 : queue2){
            System.out.print(a2+" ");
        }
```
