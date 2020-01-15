## .book_prog

编写一个类Book，代表教材:  
具有属性：名称（title）、页数（pageNum），其中页数不能少于200页，否则输出错误信息，并赋予默认值200
为各属性设置赋值和取值方法；  
具有方法:detail，用来在控制台输出每本教材的名称和页数；  
编写测试类BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确；

## .car_prog
汽车类Car  型号       汽车名     颜色   生产日期     制造商 等  
如:       奔驰       大奔s300   黑色  2019-10-20  made in china     
有不同的汽车存储在汽车仓库里面；  
输入要买的汽车型号,卖出去的车从仓库移除该车记录，如果有不同的人来买一样的车子呢；

## .student_prog
现有n个班级每个班级m个学生,学生属性:学号,姓名,年龄,班级号,成绩：  
a.请根据每个班级的学生的年龄进行排序,并且输出相应的学生信息；  
b.求出每个班级的学生平均分进行升序排序；

## .value_prog

<ol>
  <li>调用全局变量和局部变量的区别； </li>
  <li>自增的运算； </li>
</ol>

## .banking

创建一个简单版本的（账户类）Account类。将这个源文件放入banking程序包中。  
在创建单个帐户的默认程序包中，已编写了一个测试程序TestBanking。  
这个测试程序初始化帐户余额，并可执行几种简单的事物处理。  
最后，该测试程序显示该帐户的最终余额。  

1. 建banking包  

2. 在banking 包下创建Account类。  
   1. 声明一个私有对象属性：balance，这个属性保留了银行帐户的当前（或即时）余额。  
   2. 声明一个带有一个参数（init_balance）的公有构造器，这个参数为balance属性赋值。  
   3. 声明一个公有方法getBalance，该方法用于获取经常余额。  
   4. 声明一个公有方法deposit,该方法向当前余额增加金额。  
   5. 声明一个公有方法withdraw从当前余额中减去金额。    
3. 编译TestBanking.java文件。  
4. 运行TestBanking类。可以看到下列输出结果：    
   Creating an account with a 500.00 balance  
   Withdraw 150.00  
   Deposit 22.50  
   Withdraw 47.62  
   The account has a balance of 324.88