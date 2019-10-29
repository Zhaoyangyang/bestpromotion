+ String 字符串常量

+ StringBuffer 字符串变量（线程安全）

+ StringBuilder 字符串变量（非线程安全）

+ String是不可变的对象（String类的声明是public final，会对系统性能产生影响）修改String
时，不会在原有的内存地址修改，而是重新指向一个新对象

+ StringBuffer：线程安全的可变字符序列，通过某些方法调用可以改变该序列的长度和内容。

+ StringBuffer上的主要操作是 append 和 insert 方法，可重载这些方法，以接受任意类型的数据。