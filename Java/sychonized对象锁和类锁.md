多线程访问同步方法的7中情况：是否是static ，Synchonized的方法

对象锁：方法锁（修饰普通方法：默认锁对象为this的实例对象）同步代码块儿锁（自己指定锁对象）
类锁：Synchonized修饰静态的方法或指定锁对象为Class对象。

JAVA 可能有多个对象，但只有一个class对象
两种形式：Synchonized 加在static方法上
Synchonized（.class）+代码块

两个线程同时访问一个对象的同步方法

两个线程访问的是两个对象的同步方法

两个线程访问的是Synchonized的静态方法

