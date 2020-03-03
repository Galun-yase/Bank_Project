## Java基础实战——Bank项目（尚硅谷）  
###【简介】  
《Bank项目》是“Java基础阶段”代码实战之一。此项目可以作为Java自学者自测的经典项目！   
###【项目特点】   
-   
###更多技术涵盖：  
由8组由浅入深的模块构成，应用如下技术：面向对象的封装性，构造器，引用类型的成员变量，异构数组，继承，多态，方法的重载，方法的重写，包装类，单例模式，  异常，集合。  
-    
###涉及较复杂业务：
以银行业务为背景，包含：添加客户，创建异构账户，存钱，取钱，透支保护等业务。    
-   
###类之间多重引用、依赖关系：  
该项目包含  

    Bank,Customer,Account,SavingAccount,CheckingAccount,
    OverdraftException,CustomerReport,Te  stBanking
    等八个类组成；
    Bank和Customer、
    Customer和Account(SavingAccount、CheckingAccount)、
    CheckingAccount和OverdraftException、
    CustomerReport和Bank
    之间以方法参数、成员变量的方式建立引用、依赖关系。



