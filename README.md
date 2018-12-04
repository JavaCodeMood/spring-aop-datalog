#Spring AOP    
AOP定义：  
1. 是一种编程范式，不是编程语言   
2. 解决特定问题，不能解决所有问题    
3. 是OOP的补充，不是替代    
     
使用AOP的好处：    
1. 集中处理某一关注点/横切逻辑
2. 可以很方便地添加/删除关注点
3. 侵入性少，增强代码可读性及可维护性
4. 实现"高内聚，低耦合"

AOP的使用场景：
1. 权限控制
2. 缓存控制
3. 事务控制
4. 审计日志
5. 性能监控
6. 分布式追踪
7. 异常处理等

AOP注解实现：  
1. @Aspect：切面 = 切点+通知（手动添加的代码，一般是方法）； 
2. @Point：切点，横切关注点； 
3. 5种Advice注解  
（1）@Before（前置通知）：添加的内容在切点之前执行；     
（2）@After（后置通知）: 添加的内容在切点之后执行；      
（3）@AfterReturning(返回通知):成功执行之后；    
（4）@AfterThrowing(异常通知)：抛出异常之后；    
（5）@Around（环绕通知）
